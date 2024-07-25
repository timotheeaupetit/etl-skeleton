package etl.model.silver

import etl.model.bronze.CommonBronzeModel
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

trait CommonSilverModel {
  val bronzeModel: CommonBronzeModel

  val silverPath: String

  val silverSchema: StructType

  def load(): DataFrame = ???

  def transform(df: DataFrame): DataFrame

  def saveToSilver(df: DataFrame): Unit = {
    // do something
  }
}
