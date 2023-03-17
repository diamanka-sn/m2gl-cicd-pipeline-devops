FROM openjdk:8
EXPOSE 8080
ADD target/m2ginielogiciel-ci-cd.jar m2ginielogiciel-ci-cd.jar
ENTRYPOINT [ "java","-jar", "/m2ginielogiciel-ci-cd.jar" ]