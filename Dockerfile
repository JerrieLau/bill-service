FROM maven:3.3.3

ADD pom.xml /tmp/build/
ADD settings.xml /usr/share/maven/conf/
ADD src /tmp/build/src/

# RUN cd /tmp/build && mvn  dependency:resolve

RUN cd /tmp/build && mvn  clean package -DskipTests=true \  
         && mv target/*.jar /app.jar \
         && cd /  \
         && rm -rf /tmp/build

VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
