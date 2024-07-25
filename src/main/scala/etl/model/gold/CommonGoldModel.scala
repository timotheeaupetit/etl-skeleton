package etl.model.gold

import etl.model.silver.CommonSilverModel
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

trait CommonGoldModel {
  val silverModel: CommonSilverModel

  val goldPath: String

  val goldSchema: StructType

  def transform(df: DataFrame): DataFrame

  def saveToGold(df: DataFrame): Unit = {
    // do something
  }
}
