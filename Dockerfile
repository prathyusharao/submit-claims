FROM openjdk:8
EXPOSE 8096
ADD target/spring-boot-claims-docker.jar spring-boot-claims-docker.jar 
ENTRYPOINT ["java","-jar","/spring-boot-claims-docker.jar"]