lazy val root = (project in file(".")).settings(name := "algorithms-scala")

ThisBuild / version      := "1.0.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.7"

ThisBuild / scalacOptions ++= Seq("--deprecation", "--unchecked")

idePackagePrefix := Some("com.fineconstant.algscala")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
