package com.shadowinlife.app.ExtraData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

public class DeliveryHiveDB {
   

    public static void DeliveryByTableName(HiveContext sqlContext, String tableName, String url,
            String strWhere, String mySQLWhere, Map<String, String> map) {

        DataFrame strColumns = sqlContext.sql("desc " + tableName);
        List<String> columnList = new ArrayList<String>();
        for (Row r : strColumns.collect()) {
            if (r.getString(0).contains("index_"))
                break;
            columnList.add(r.getString(0));
        }
       
        
        DeliveryDataToMysql Process = new DeliveryDataToMysql();
        Process.insertIntoMysql(sqlContext, url, tableName, map.get(tableName.trim()), columnList,
                strWhere, mySQLWhere);

    }
}
