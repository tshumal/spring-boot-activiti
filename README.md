# Process definition with Spring boot and Activiti BPMN 2.0 Engine

## Introduction

Activiti is an Apache-licensed business process management (BPM) engine. Such an engine has as core goal to take a process definition comprised of human tasks and service calls and execute those in a certain order, while exposing various API’s to start, manage and query data about process instances for that definition.

Activiti and Spring play nicely together. The convention-over-configuration approach in Spring Boot works nicely with Activiti’s process engine is setup and use.

## Frameworks

### Back-end

#### Spring Boot
One of the hassles while creating web applications using the Spring Framework is that it involves a lot of configuration. Spring Boot makes it possible to write configuration-less web application because it does a lot for you out of the box.
For example, if you add HSQLDB as a dependency to your application, it will automatically provide a datasource to it.
If you add the spring-boot-starter-web dependency, then you can start writing controllers for creating a web application.

#### Spring Data JPA
Spring Data JPA allows you to create repositories for your data without even having to write a lot of code. The only code you need is a simple interface that extends from another interface and then you're done.
With Spring Boot you can even leave the configuration behind for configuring Spring Data JPA, so now it's even easier.

### Activiti
Activiti is an Apache-licensed business process management (BPM) engine. Such an engine has as core goal to take a process definition comprised of human tasks and service calls and execute those in a certain order, while exposing various API’s to start, manage and query data about process instances for that definition.

## Installation
Installation is quite easy, first you will have to install some front-end dependencies using Bower:
```
bower install
```

Installation is quite easy, first you can run Maven to package the application:
```
mvn clean package
```

Now you can run the Java application quite easily:
```
cd target
java -jar spring-boot-activiti-1.0.0.jar
```

