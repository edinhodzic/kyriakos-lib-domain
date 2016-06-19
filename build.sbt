import bintray.Keys._
import sbt._

organization := "io.kyriakos.library"

name := "kyriakos-lib-domain"

version := "1.0.0"

scalaVersion := "2.11.7"

lazy val kyriakosLibDomain = project.in(file(".")).
  settings(bintrayPublishSettings: _*).
  settings(
    sbtPlugin := false,
    name := "kyriakos-lib-domain",
    licenses += ("MIT", url("https://opensource.org/licenses/MIT")),
    publishMavenStyle := false,
    repository in bintray := "kyriakos",
    bintrayOrganization in bintray := None
  )

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.7"
)
