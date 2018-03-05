organization := "a8"

name := "twitter-eval-revival"

version := "0.1"

scalaVersion := "2.12.4"

publishTo in Global := Some("a8-repo-publish" at "https://accur8.artifactoryonline.com/accur8/libs-releases-local/")

credentials in Global += Credentials(Path.userHome / ".sbt" / "credentials")

libraryDependencies += "com.twitter" % "util-core_2.12" % "18.2.0"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.12.4" % "compile"

libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"