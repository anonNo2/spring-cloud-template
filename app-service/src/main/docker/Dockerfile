FROM anon.cn/alpine/jdk8:1.0.0
VOLUME /tmp
ADD app-service-1.0-SNAPSHOT.jar user.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
