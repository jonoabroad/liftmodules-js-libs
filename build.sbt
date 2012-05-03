name := "js-libs"

version := "2.5-SNAPSHOT-0.4"

organization := "net.liftmodules"
 
scalaVersion := "2.9.2"

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= {
  val liftVersion = "2.5-SNAPSHOT" 
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

