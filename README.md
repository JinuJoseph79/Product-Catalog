# Product-Catalog
Shopping Cart application is an online shopping protal. It is developed using microservice architecture.

Microservices is an architecture wherein all the components of the system are put into individual components, which can be built, deployed, and scaled individually.

Product-Catalog is a client that both registers itself with the registry and uses the Spring Cloud DiscoveryClient abstraction to interrogate the registry for its own host and port. The @EnableDiscoveryClient activates the Netflix Eureka DiscoveryClient implementation.

## Getting Started
This repository contains the code for the Product Catalog service of the Microservice. The code can be cloned to local directory.

Dependencies:
org.springframework.boot
spring-boot-starter-thymeleaf
spring-boot-starter-data-jpa
com.microsoft.sqlserver
spring-cloud-starter
spring-cloud-starter-netflix-eureka-server
junit


Open the project in IDE (Eclipse, Intellij) and resolve the dependencies issues if any. 
Run the Euerka Service. Then start the Product-Catalog service and Webserver service. 
 
## Features
Shopping Cart is an online portal. Product-Catalog is service which is to demonstrate Microservices. Product Catalog connects to the MS SQL Server database and fetched the product information and passes it on to webserver service.

## Deployment 
Run the Eurake Service first and then the Product-Catalog service. In the Eureka Service we can see that the Product-Catalog service is shown in the Instance currently registered with Eurake list.

## Technology used

The application is build on top of Spring Boot (http://projects.spring.io/spring-boot/) providing a runtime container.

spring-cloud-starter-netflix-eureka-server is the Client-side service discovery that allows services to find and communicate with each other without hard-coding hostname and port. The only ‘fixed point' in such an architecture consists of a service registry with which each service has to register.

Microsoft SQL Server 2019 is used for database.  Microsoft SQL Server Management Studio is used to connect to the database server using SQL Server Authentication. After login create database and create registered_user table to save the registered users details

Spring Data JPA is used for database integration. Hibernate is included by default. Spring Boot will automatically configure default Hibernate properties. Database URL, username and password is given in Appilcation.properties file.

JPA CRUD Repository is used for saving user details to database. 

Junit test is used to test java code for saving to hashmap.

## Environment

Operation System: Windows 10

Java Version: Java 8
 
