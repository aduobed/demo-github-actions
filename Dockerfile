FROM adoptopenjdk:11
EXPOSE 8080
ADD out/artifacts/tlc4_springboot_final_project_image_jar/tlc4-springboot-final-project-image.jar tlc4-springboot-final-project-image.jar
ENTRYPOINT ["java", "-jar","/tlc4-springboot-final-project-image.jar"]