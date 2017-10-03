val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.20")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
