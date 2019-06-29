#FROM java:openjdk-8-jre-alpine
#ARG version
#ADD cmlx-jenkins-test-0.0.1-SNAPSHOT.jar app.jar
#RUN echo "Asia/shanghai" > /etc/timezone
#ENV XCODE=""
#ENTRYPOINT java $XCODE -jar /app.jar

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD cmlx-jenkins-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]