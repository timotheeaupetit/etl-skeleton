package etl.app

import etl.controller.IngestionSilverController
import etl.model.silver.SomeSilverModel

// Every object here should extend App. Each object is the entry point for a particular job that can be scheduled, launched manually...
object IngestionSilverBatch extends App {
  IngestionSilverController.run(SomeSilverModel)
}
