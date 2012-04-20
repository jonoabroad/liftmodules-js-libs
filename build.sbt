name := "js-libs"

version := "2.4-0.4"

organization := "net.liftmodules"
 
scalaVersion := "2.9.1"
 
crossScalaVersions := Seq("2.8.1", "2.9.0-1", "2.9.1")

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

libraryDependencies ++= {
  val liftVersion = "2.4" 
  Seq("net.liftweb" %% "lift-webkit" % liftVersion % "compile->default")
}

// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default" // Logging
)

 // To publish to the Cloudbees repos:

publishTo := Some("liftmodules repository" at "https://repository-liftmodules.forge.cloudbees.com/release/")
 
credentials += Credentials( file("/private/liftmodules/cloudbees.credentials") )

