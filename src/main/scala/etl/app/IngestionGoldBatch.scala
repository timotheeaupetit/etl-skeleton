package etl.app

import etl.controller.IngestionGoldController
import etl.model.gold.SomeGoldModel

// Every object here should extend App. Each object is the entry point for a particular job that can be scheduled, launched manually...
object IngestionGoldBatch extends App {
  IngestionGoldController.run(SomeGoldModel)
}
