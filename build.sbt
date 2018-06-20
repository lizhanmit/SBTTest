name := "SBTTest"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"

libraryDependencies += "org.apache.hbase" % "hbase-client" % "1.2.6"
libraryDependencies += "org.apache.hbase" % "hbase-common" % "1.2.6"
libraryDependencies += "org.apache.hbase" % "hbase-server" % "1.2.6"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.3.0"