name := "redis-testing"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= Seq(
  "org.scalatest"         %% "scalatest"      % "2.2.6" % "test",
  "com.typesafe.akka"     %% "akka-stream"    % "2.4.12",
  "com.typesafe.akka"     %% "akka-slf4j"     % "2.4.12",
  "io.dropwizard.metrics" % "metrics-core"    % "3.1.2",
  "com.github.scopt"      %% "scopt"          % "3.4.0",
  "org.slf4j"             % "slf4j-log4j12"   % "1.7.7",
  "log4j"                 % "log4j"           % "1.2.17",
  "com.whitepages"        %% "token-bucket"   % "3.0.0",
  "redis.clients"         % "jedis"           % "2.9.0",
  "biz.paluch.redis"      % "lettuce"         % "4.3.2.Final",
  "org.redisson"          % "redisson"        % "3.4.1"
)

assemblyMergeStrategy in assembly := {
  case x if x.endsWith("io.netty.versions.properties") => MergeStrategy.first
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
