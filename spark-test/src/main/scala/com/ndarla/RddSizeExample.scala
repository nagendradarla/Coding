package com.ndarla

import org.apache.spark.api.java.{JavaRDD, JavaSparkContext}
import org.apache.spark.api.java.function.{Function, Function2}
import org.apache.spark.sql.SparkSession

class RddSizeExample {
  def main(args: Array[String]): Unit = {
    // Initialize the Spark session
    val spark = SparkSession.builder()
      .appName("RDD Size Calculation")
      .master("local[*]")  // Use local mode with all available cores
      .getOrCreate()

    // Create a Scala List of strings
    val data = List("Hello", "World", "Spark", "RDD")

    // Convert the List to a Scala Seq (Seq is a type compatible with parallelize)
    val scalaSeq = data

    // Use SparkContext's parallelize method on the Scala Seq
    val rdd = spark.sparkContext.parallelize(scalaSeq, 4)  // 4 partitions

    // Calculate the total size in bytes of the RDD
    val sizeInBytes = rdd.map(s => s.getBytes("UTF-8").length).reduce(_ + _)

    // Output the result
    println(s"Total RDD size in bytes: $sizeInBytes")

    // Stop Spark session
    spark.stop()
  }
}
