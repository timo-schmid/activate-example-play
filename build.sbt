name := "activate-example-play"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

val activateVersion = "1.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.specs2" %% "specs2" % "2.4.2" % "test" force(),
  "net.fwbrasil" %% "activate-play" % activateVersion,
  "net.fwbrasil" %% "activate-jdbc" % activateVersion,
  "net.fwbrasil" %% "activate-slick" % activateVersion,
  "net.fwbrasil" %% "activate-core" % activateVersion
)

Keys.fork in Test := false
