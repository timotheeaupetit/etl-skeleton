package etl.controller

import etl.model.gold.CommonGoldModel

object IngestionGoldController {
  def run(model: CommonGoldModel): Unit = {
    val silverModel = model.silverModel

    val dfSilver = silverModel.load()

    val dfGold = model.transform(dfSilver)

    model.saveToGold(dfGold)
  }
}
