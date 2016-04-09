import sbt._

organization := "io.otrl.library"

name := "otrl-lib-domain"

version := "0.5.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val otrlLibDomain = project.in(file("."))

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.7"
)

publishTo := Some("OTRL" at "https://mvn.otrl.io")
