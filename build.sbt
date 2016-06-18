import sbt._

organization := "io.kyriakos.library"

name := "kyriakos-lib-domain"

version := "0.5.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val kyriakosLibDomain = project.in(file("."))

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.7"
)
