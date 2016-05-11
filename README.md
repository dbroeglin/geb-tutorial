# Geb & Gradle Tutorial

This is heavily inspired by http://www.mengu.net/post/geb-and-gradle
I mainly refreshed the Gradle build file to work with Gradle 2.x and the
Geb example to work with modern Google.

## Build & run

To build and run the test:

    gradle run

## Package as a fat JAR and run

To package the whole test as a ~fat~ JAR with all dependencies:

    gradle shadowJar

Then just run it with java:

    java -jar build/libs/geb-tutorial-all.jar
