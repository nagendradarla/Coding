package com.ndarla;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import scala.Function2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.function.Function;

public class FinndingCommonElements {
//    List 1: [id28,  id1, id2, id3, id25, ..]
//
//    List 2 : [id25, id30, id1001, id28,  ….]
//    overlap [id25, id28]
//            return count of overlap : 2
//    list is infinitely long and not sorted.
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("FinndingCommonElements")
                .master("local[*]") // For local testing
                .getOrCreate();

        ArrayList list1 = new ArrayList<String>();
        list1.add("id28");
        list1.add("id28");
        list1.add("id28");
        ArrayList list2 = new ArrayList<String>();
        list2.add("id28");
        list2.add("id28");
        list2.add("id28");

        Dataset<Row> df1 = spark.read().csv("path/to/list1");

        Dataset<Row> df2 = spark.read().csv("path/to/list2");

        // Calculate the size of the df
        // Calculate the total size in bytes of the RDD

        // partition bumber - size / 128 mb
        // partition the data
        df1.repartition(4);
        df1.createOrReplaceTempView("List1");
        // Calculate the size of the df
        //estimateSize(df2);
        // partition bumber - size / 128 mb
        // partition the data
        df1.repartition(4);
        // partition the data
        df2.createOrReplaceTempView("List2");

        spark.sql(" SELECT * FROM LIST1 INNER JOIN LIST2 WHERE LIST1.id = LIST2.id").toDF();
    }
}
