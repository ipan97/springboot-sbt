import spray.revolver.RevolverPlugin._
Revolver.settings
mainClass in Revolver.reStart := Some("com.github.ipan97.springboot.sbt.Application")
Revolver.reStartArgs := Seq("run", "scala:com.github.ipan97.springboot.sbt.Application")
  
name := """springboot-sbt"""

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test",
  "org.springframework.boot" % "spring-boot-starter-web" % "1.3.2.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.3.2.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-test" % "1.3.2.RELEASE",
  "mysql" % "mysql-connector-java" % "5.1.38"
)
