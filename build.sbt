import sbt.{Credentials, Path}

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

//crossScalaVersions in ThisBuild := Seq("2.11.11", "2.10.6", "2.12.2", "2.13.0-M1")
scalaVersion in ThisBuild := "2.12.3"

name := "jQuery"

normalizedName := "scalajs-jquery"

version := "0.9.3-SNAPSHOT"

organization := "be.doeraene"

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.9.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

publishMavenStyle := true

publishTo := {
    val corporateRepo = "http://toucan.simplesys.lan/"
    if (isSnapshot.value)
        Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
    else
        Some("releases" at corporateRepo + "artifactory/libs-release-local")
}
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")


