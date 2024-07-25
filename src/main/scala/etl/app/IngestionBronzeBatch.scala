package etl.app

import etl.controller.IngestionBronzeController
import etl.model.bronze.SomeBronzeModel

// Every object here should extend App. Each object is the entry point for a particular job that can be scheduled, launched manually...
object IngestionBronzeBatch extends App {
  IngestionBronzeController.run(SomeBronzeModel)
}
