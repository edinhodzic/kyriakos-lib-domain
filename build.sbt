import sbt._

organization := "io.kyriakos.library"

name := "kyriakos-lib-domain"

version := "1.0.0"

scalaVersion := "2.11.7"

lazy val kyriakosLibDomain = project.in(file("."))

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.7"
)
