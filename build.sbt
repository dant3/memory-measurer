organization := "com.github.dant3"

name := "memory-measurer"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
    "org.feijoas" %% "mango" % "0.10",
    "com.google.code.findbugs" % "jsr305" % "1.3.+",
    "junit" % "junit" % "4.11" % "test",
    "org.scalatest" % "scalatest_2.10" % "2.0.M8" % "test",
    "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"
)
