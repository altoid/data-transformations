package main

import org.apache.spark.sql.SparkSession

object HelloSpark {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Hello Spark App")
      .master("local[*]")  // had to add this
      .getOrCreate()
    println("Hello Spark")
    spark.stop()
  }

}
