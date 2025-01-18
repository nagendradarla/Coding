package com.ndarla;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.sql.SparkSession;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import scala.reflect.ClassTag$;

import java.util.Arrays;
import java.util.List;

public class RddSizeExample {

    public static void main(String[] args) {

//        // Create a SparkSession
//        SparkSession spark = SparkSession
//                .builder()
//                .appName("ParallelizeExample")
//                .master("local[*]") // Run locally
//                .getOrCreate();
//
//        // Create a Java List of integers
//        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
//
//        // Convert Java List to Scala Seq
//        scala.collection.Seq<Integer> scalaSeq = JavaConverters.asScalaBuffer(data).seq();
//
//        // Create a JavaRDD from the list using SparkSession
//        JavaRDD<Integer> parallelizedData = spark.sparkContext().parallelize(scalaSeq, 4, ClassTag$.MODULE$.apply(Integer.class)).toJavaRDD();

        // Initialize the Spark session
        SparkSession spark = SparkSession.builder()
                .appName("RDD Size Calculation")
                .master("local[*]")
                .getOrCreate();

        // Create a JavaSparkContext
        JavaSparkContext sc = new JavaSparkContext("local[*]", "ParallelizeExample");

        // Create a List of strings
        List<String> data = Arrays.asList("Hello", "World", "Spark", "RDD");
        Seq<String> scalaSeq = JavaConverters.asScalaIteratorConverter(data.iterator()).asScala().toSeq();
        // Create an RDD from the List using SparkContext's parallelize method
//        JavaSparkContext sc = spark.sparkContext()
        JavaRDD<String> rdd = spark.sparkContext()
                .parallelize(scalaSeq, 4, ClassTag$.MODULE$.apply(Integer.class))  // Use List<String> directly
                .toJavaRDD();

        // Calculate the total size in bytes of the RDD
        int sizeInBytes = rdd.map(new Function<String, Integer>() {
            @Override
            public Integer call(String s) throws Exception {
                return s.getBytes("UTF-8").length;
            }
        }).reduce(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer a, Integer b) throws Exception {
                return a + b;
            }
        });

        // Output the result
        System.out.println("Total RDD size in bytes: " + sizeInBytes);

        // Stop the Spark session
        spark.stop();
    }
}
