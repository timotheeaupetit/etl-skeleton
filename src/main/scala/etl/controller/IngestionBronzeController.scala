package etl.controller

import etl.model.bronze.CommonBronzeModel

object IngestionBronzeController {
  def run(model: CommonBronzeModel): Unit = {
    move(model.rawLandingPath, model.rawToProcessPath)

    val dfToProcess = model.loadRawToProcess()

    val dfProcessed = model.transform(dfToProcess)

    model.saveToOptimized(dfProcessed)

    move(model.rawToProcessPath, model.rawProcessedPath)
  }

  private def move(source: String, destination: String): Unit = {
    // do something
  }
}
