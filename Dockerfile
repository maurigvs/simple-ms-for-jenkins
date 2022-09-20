FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/simple-ms-for-jenkins-0.0.1-SNAPSHOT.jar simple-ms-for-jenkins.jar
ENTRYPOINT [ "java", "-jar", "/simple-ms-for-jenkins.jar" ]