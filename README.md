# Maven Kotlintest Example Project

This project is intended to show that there is a bug in the integration between
[KotlinTest], the [JUnit platform] & the [Maven Surefire plugin].

To build:

`mvn package`

Observe that the build passes, but one of the tests has failed in initialisation. 

[KotlinTest]: https://github.com/kotlintest/kotlintest
[JUnit platform]: https://junit.org/junit5/docs/5.4.2/user-guide/index.html
[Maven Surefire plugin]: https://maven.apache.org/surefire/maven-surefire-plugin/index.html
