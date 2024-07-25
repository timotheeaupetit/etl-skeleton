package etl.model.bronze
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.StructType

case object SomeBronzeModel extends CommonBronzeModel {

  override val rawLandingPath: String = "rawLanding/path"
  override val rawToProcessPath: String = "rawToProcess/path"
  override val rawProcessedPath: String = "rawProcessed/path"
  override val rawOptimizedPath: String = "rawOptimized/path"

  override val rawSchema: StructType = ???
  override val optimizedSchema: StructType = ???

  override def transform(df: DataFrame): DataFrame = ???

}
