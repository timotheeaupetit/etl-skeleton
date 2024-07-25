package etl.core

import scala.util.Properties

object EnvironmentVariables {
  lazy val envName: String = Properties.envOrElse("ENV_NAME", "dev")
}
