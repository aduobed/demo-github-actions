FROM adoptopenjdk:11
EXPOSE 8080
ADD build/libs/tlc4-springboot-final-project-image-0.0.1-SNAPSHOT.jar tlc4-springboot-final-project-image.jar
ENTRYPOINT ["java", "-jar","/tlc4-springboot-final-project-image.jar"]