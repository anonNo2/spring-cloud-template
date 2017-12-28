FROM anon.cn/alpine/jdk8:1.0.0
VOLUME /tmp
ADD user-service-1.0-SNAPSHOT.jar user.jar
RUN bash -c 'touch /user.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user.jar"]
