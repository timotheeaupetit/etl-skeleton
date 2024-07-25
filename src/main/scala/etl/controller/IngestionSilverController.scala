package etl.controller

import etl.model.silver.CommonSilverModel

object IngestionSilverController {
  def run(model: CommonSilverModel): Unit = {
    val bronzeModel = model.bronzeModel

    val dfOptimized = bronzeModel.loadOptimized()

    val dfSilver = model.transform(dfOptimized)

    model.saveToSilver(dfSilver)
  }
}
