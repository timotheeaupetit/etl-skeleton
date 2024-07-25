package etl.model.bronze

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

trait CommonBronzeModel {
  val rawLandingPath: String
  val rawToProcessPath: String
  val rawProcessedPath: String
  val rawOptimizedPath: String

  val rawSchema: StructType
  val optimizedSchema: StructType

  def loadRawToProcess(): DataFrame = ???

  def loadOptimized(): DataFrame = ???

  def transform(df: DataFrame): DataFrame

  def saveToOptimized(df: DataFrame): Unit = {
    // do something
  }
}
