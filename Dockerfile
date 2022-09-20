FROM openjdk:11
EXPOSE 8000
COPY "target/simple-ms-for-jenkins.jar" simple-ms-for-jenkins.jar
CMD [ "java", "-jar", "simple-ms-for-jenkins.jar" ]