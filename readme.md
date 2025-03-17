# Kotlin Quick Start
A template project for a Spring Batch command line application with the following features

- Based on Java 17
- written in [Kotlin](https://kotlinlang.org/)
- powered by [Spring Boot](https://spring.io/projects/spring-boot)
- and [Spring Batch](https://spring.io/projects/spring-batch/)
- build with [Gradle](https://gradle.org/)

## Steps to use the template
I use this template as a starting point for my Spring Batch command line applications.
If you want to try it, you have to follow these steps:  

- Create repository on Github with this [link](https://github.com/ChrLipp/starter-template/generate).
- Clone the repository.
- Choose `rootProject.name` in `settings.gradle`
- Choose group and version in `gradle.properties`
- Refactor class `StarterTemplateApplication` (name and namespace)
- Refactor class `StarterTemplateConfiguration` (name and namespace)
- Refactor class `StarterTemplateApplicationTests` (name and namespace)
- Set logfile name `logging.file.name` in `application.properties`
- Set log level for your namespace `logging.level.*` in `application.properties`
- Change `readme.md`
- Run the application with `./gradlew run`
- When using IntelliJ IDEA, edit "Run configuration" and
  add environment variable `spring.output.ansi.enabled=ALWAYS`
- Adopt the steps depending on your requirements

## Gradle usage

- Building `./gradlew build`
- Running `./gradlew run`
- Testing `./gradlew test`
- Dependency updates `./gradlew dependencyUpdates`, change version numbers in `gradle.properties`
