# Building an Application with Spring Boot
## Test

* [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)

# Using Powershell Invoke-WebRequest aka "curl" 

## Invoking default REST controller
* curl -Uri "http://localhost:8080"
## Getting health
* curl -Uri "http://localhost:8080/actuator/health"
## Getting information
* curl -Uri "http://localhost:8080/actuator/info"
## Shutting down server with shutdown enabled
* curl -ContentType "application/json; charset=utf-8" -Method "POST" -Uri "http://localhost:8080/actuator/shutdown"

spring CLI no longer contains "run" command so can't run app.groovy example