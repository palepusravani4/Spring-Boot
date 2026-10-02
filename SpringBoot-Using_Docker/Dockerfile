FROM eclipse-temurin:21-jdk

COPY target/SB_Docker.jar /hp/app/

WORKDIR /hp/app/

ENTRYPOINT ["java","-jar","SB_Docker.jar"]