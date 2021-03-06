package com.shadowinlife.app.LogAnalyse;

import java.util.List;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.api.java.UDF1;
import org.apache.spark.sql.hive.HiveContext;
import org.apache.spark.sql.types.DataTypes;

import com.shadowinlife.app.LogAnalyse.FatTable.CreateProcessTable;
import com.shadowinlife.app.LogAnalyse.OssTableSQL.UserAccountAnalysis;
import com.shadowinlife.app.Tools.ReadConfigurationFile;

/**
 * @author shadowinlife
 * @since 2014-04-03
 * 
 *        Main class of the analyse app
 */

public class Main {

    public static void main(String[] args) {
     
        String mode = null;
        String date = null;
        String Flag = null;
        String iWorldId = null, iGameId = null, iAccountType = null;
        String tableName = null;
        String FilePath = null;
        String ConfiguationFile = null;
        List<Map<String, List<String[]>>> l = null;
        String Action = null;
        boolean debug = false;
        for (int i = 0; i < args.length; i = i + 2) {

            // 入参格式监测
            if (!args[i].contains("--")) {
                System.out.println("Wrong Parameter\n --help for all parameters");
                return;
            }

            // 帮助文件
            if (args[i].contains("help")) {
                System.out.println("--CONF configuration xml file\n"
                        + "--MODE  MODE_NAME  IF MODE=NULL Dont't Create Oss Table\n"
                        + "--MYSQLURL for MySql\n" + "--DATE Index Field Date\n"
                        + "--GAMEID Index Filed Gameid\n" + "--WORLDID Index Filed WORLDID\n"
                        + "--ACCOUNTTYPE Index Filed ACCOUNTTYPE\n"
                        + "--TAG   ALL 即计算fat表，也计算结果表， mode为空则所有模式都计算\n"
                        + "        OSS  只计算结果表，mode为空计算所有种类的结果表\n"
                        + "        FAT 只计算Fat表，Mode为空则计算所有种类的中间表\n"
                        + "--ACTION 所希望运行的Action的名字，使用逗号隔开\n"
                        + "--DEBUG 是否开启DEBUG模式");
                return;
            }

            // 获取入参
            switch (args[i]) {
            case "--CONF":
                ConfiguationFile = args[i + 1];
                break;
            case "--MODE":
                mode = args[i + 1];
                switch (mode) {
                case "pay":
                    tableName = "MoneyFlow";
                    break;
                case "deposit":
                    tableName = "Deposit";
                    break;
                case "login":
                    tableName = "RoleLogin";
                    break;
                default:
                    tableName = mode;
                }
                break;
            case "--TAG":
                Flag = args[i + 1];
                break;
            case "--DATE":
                date = args[i + 1];
                break;
            case "--GAMEID":
                iGameId = args[i + 1];
                break;
            case "--WORLDID":
                iWorldId = args[i + 1];
                break;
            case "--ACCOUNTTYPE":
                iAccountType = args[i + 1];
                break;
            case "--ACTION":
                Action = args[i+1];
                break;
            case "--DEBUG":
                debug = Boolean.valueOf(args[i+1]);
                break;
            }
        }
        // 初始化基本环境
        SparkConf conf = new SparkConf().setAppName("Log Analyzer");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
        HiveContext sqlContext = new HiveContext(sc.sc());
        //切换到FAT表使用的HIVE数据库,这个hard code要被优化掉
        sqlContext.sql("use dbprocess");
        //添加自定义function
        sqlContext.sql("ADD JAR hdfs://10-4-28-24:8020//udf.jar");
        
        sqlContext.udf().register("ConvertNull", new UDF1<Long, Long>() {
            @Override
            public Long call(Long value) throws Exception {
                if (value == null)
                    return -1l;
                return value;
            }

        }, DataTypes.LongType);
        
        // 读取配置文件
        if (ConfiguationFile != null) {
            l = ReadConfigurationFile.ReadLogAnalyseConfiguration(ConfiguationFile);
            ActionDriver.Scheduler(sqlContext, l, date, Action, iWorldId);
            return;
        }

        // 入参合法性监测
        if (ConfiguationFile == null) {
            if (date == null || Flag == null) {
                System.out.println("Parameter is illegal, see --help");
                sc.stop();
                sc.close();
                return;
            }
        }
        if (Flag.equalsIgnoreCase("ALL") || Flag.equalsIgnoreCase("FAT")) {
            if (iWorldId == null) {
                System.out.println("iworldid can not be null");
                sc.stop();
                sc.close();
                return;
            }
        }

    
       

        // 根据入参调度程序
        try {
            if ((Flag.equalsIgnoreCase("ALL") || Flag.equalsIgnoreCase("FAT")) && mode != null) {

                CreateProcessTable.FatTableConstruct(sqlContext, FilePath, tableName, date,
                        iWorldId);

            } else if ((Flag.equalsIgnoreCase("ALL") || Flag.equalsIgnoreCase("FAT"))
                    && mode == null) {
                CreateProcessTable.FatTableConstruct(sqlContext, FilePath, "RoleLogin", date,
                        iWorldId);
                CreateProcessTable.FatTableConstruct(sqlContext, FilePath, "Task", date, iWorldId);
                CreateProcessTable.FatTableConstruct(sqlContext, FilePath, "MoneyFlow", date,
                        iWorldId);
                CreateProcessTable.FatTableConstruct(sqlContext, FilePath, "Deposit", date,
                        iWorldId);

            } else if ((Flag.equalsIgnoreCase("ALL") || Flag.equalsIgnoreCase("OSS"))
                    && mode == null) {
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "pay", date);
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "deposit", date);
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "login", date);
                
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "pay_roleid", date);
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "deposit_roleid", date);
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, "login_roleid", date);
            } else if ((Flag.equalsIgnoreCase("ALL") || Flag.equalsIgnoreCase("OSS"))
                    && mode != null) {
                UserAccountAnalysis.create_tbRegisterUser(sqlContext, mode, date);
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.stop();
        sc.close();
    }
}
