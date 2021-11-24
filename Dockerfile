FROM adoptopenjdk:11
EXPOSE 8080
ADD target/tlc4-springboot-final-project-image.jar tlc4-springboot-final-project-image.jar
ENTRYPOINT ["java", "-jar","/tlc4-springboot-final-project-image.jar"]