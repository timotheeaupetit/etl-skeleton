ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

inThisBuild(
  List(
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
)

val sparkVersion = "3.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "etl-skeleton",
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-Wunused")
  )
  .settings(libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-sql"
  ).map(_ % sparkVersion))
  .settings(libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest-funspec" % "3.2.19"
  ).map(_ % Test))
