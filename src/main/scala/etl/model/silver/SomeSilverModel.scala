package etl.model.silver
import etl.model.bronze.{CommonBronzeModel, SomeBronzeModel}
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

case object SomeSilverModel extends CommonSilverModel {

  override val bronzeModel: CommonBronzeModel = SomeBronzeModel
  override val silverPath: String = "silver/path"
  override val silverSchema: StructType = ???

  override def transform(df: DataFrame): DataFrame = ???
}
