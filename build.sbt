
name := "lrsi_status"

version := "0.1"

scalaVersion:= "2.10.3"

enablePlugins(JettyPlugin)

checksums in update := Nil

mainClass in (Compile, run) := Some("com.lrsi_status.model.Find")

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers ++= Seq(
  "Sonatype's Maven repository" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype's Maven1 repository" at "https://oss.sonatype.org/content/repositories/releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

libraryDependencies ++= {
  val liftVersion = "2.4-M4" // Put the current/latest lift version here
  Seq(
    "net.liftweb" %% "lift-webkit" % "3.0-M1",
    "net.liftweb" %% "lift-mapper" % "3.0-M1",
    "net.liftweb" %% "lift-wizard" % "2.6.3",
    "net.liftmodules" %% "textile_2.5" % "1.3",
    "net.databinder" %% "dispatch-core"  % "0.8.10",
    "net.databinder" %% "dispatch-oauth" % "0.8.10",
    "net.databinder" %% "dispatch-nio" % "0.8.10"
    )
}

// when using the sbt web app plugin 0.2.4+, use "container" instead of "jetty" for the context
// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-server" % "9.4.10.RC1",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.10.RC1",
  "org.eclipse.jetty" % "jetty-jsp-2.1" % "7.5.0.RC2",
  "org.mortbay.jetty" % "jsp-2.1-glassfish" % "9.1.02.B04.p0",
  "javax.servlet" % "servlet-api" % "3.0-alpha-1" % "provided",
  "org.mongodb" %% "casbah" % "2.8.1", 
  "net.liftweb" %% "lift-mongodb-record" % "3.0-M1",
  "net.liftmodules" %% "widgets_2.5" % "1.3",
  "org.scalaj" %% "scalaj-http" % "2.4.0",
  "net.liftweb" %% "lift-json" % "3.0-M1",
  "org.apache.httpcomponents" % "httpclient" % "4.5.5",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % Test,
  "org.apache.commons" % "commons-lang3" % "3.7",
  "commons-io" % "commons-io" % "2.6"
)
