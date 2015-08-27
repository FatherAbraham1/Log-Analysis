package com.shadowinlife.app.LogAnalyse.Action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

public class ReadParquetToDF {
    private static final Logger logger = LogManager.getLogger();

    public void ReadParquet(HiveContext sqlContext, String BeginTime, String EndTime,
            String[] GameId, String[] AccountType, String[] WorldId, String Table, String WhereSQL) {

        DataFrame df = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd/HH");
        Timestamp bTime = Timestamp.valueOf(BeginTime);
        Timestamp eTime = Timestamp.valueOf(EndTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bTime.getTime());

        while (calendar.getTimeInMillis() < eTime.getTime()) {
            for (String iGameId : GameId) {
                for (String iAccountType : AccountType) {
                    for (String iWorldId : WorldId) {
                        String ParquetFilePath = "/LOG/" + iGameId.trim() + "/"
                                + iAccountType.trim() + "/" + iWorldId.trim() + "/"
                                + format.format(calendar.getTime()) + "/" + Table.trim()
                                + ".parquet";
                        try {
                            DataFrame tmp = sqlContext.parquetFile(ParquetFilePath);
                            for(Row r:tmp.collect()) {
                                System.out.println("gongmeng" + r.mkString(" | "));
                            }
                            if (df == null) {
                                df = tmp;
                            } else {
                                df = df.unionAll(tmp);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            calendar.add(Calendar.HOUR_OF_DAY, 1);
        }

        df.registerTempTable("temp");
        System.out.println("gongmeng" + df.count());
        /*
        DataFrame dfFilted = sqlContext.sql(WhereSQL); 
        for(Row r:dfFilted.collect()) {
            System.out.println(r.mkString(" | "));
        }
        */
        sqlContext.registerDataFrameAsTable(df, Table.trim());
        sqlContext.dropTempTable("temp");
    }
}
