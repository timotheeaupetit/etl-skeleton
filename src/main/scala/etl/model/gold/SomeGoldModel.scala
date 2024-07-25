package etl.model.gold

import etl.model.silver.{CommonSilverModel, SomeSilverModel}
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

case object SomeGoldModel extends CommonGoldModel {

  override val silverModel: CommonSilverModel = SomeSilverModel
  override val goldPath: String = "silver/path"
  override val goldSchema: StructType = ???

  override def transform(df: DataFrame): DataFrame = ???
}
