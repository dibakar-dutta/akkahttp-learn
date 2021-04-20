name := "akkahttp-learn"

version := "0.1"

scalaVersion := "2.13.5"


val AkkaVersion = "2.6.14"
val AkkaHttpVersion = "10.2.4"
val circeVersion = "0.12.3"
val akkaHttpJsonVersion = "1.36.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "de.heikoseeberger" %% "akka-http-circe" % akkaHttpJsonVersion,
  "org.scalatest" %% "scalatest" % "3.2.7" % Test
)