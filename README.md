This is a sample project to reproduce this bug:
https://github.com/jacoco/jacoco/issues/208

$java -version
openjdk version "1.8.0_91"
OpenJDK Runtime Environment (build 1.8.0_91-b14)
OpenJDK 64-Bit Server VM (build 25.91-b14, mixed mode)

$mvn --version
Apache Maven 3.3.3 (NON-CANONICAL_2015-07-10T12:37:52_mockbuild; 2015-07-10T15:37:52+03:00)
Maven home: /usr/share/maven
Java version: 1.8.0_91, vendor: Oracle Corporation
Java home: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.91-5.b14.fc23.x86_64/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.4.9-300.fc23.x86_64", arch: "amd64", family: "unix"

$mvn clean install &> mvn_clean_install.txt