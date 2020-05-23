# Spring-Boot-War-Deployment
This repo will demonstarte how to deploy the spring boot war file to apache tomcat server

## Running Spring rest locally

You can then access Restfull here: http://localhost:8080/Spring-Boot-App/


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment/issues


## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* Tool - STS(Spring Toot Suite) or Eclipse
* Server - Apache Tomcat 7

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment.git
```
2) To Import the Praject Using STS or Eclipse. (This step is optional), Directly you can follow the below steps.
```
File -> Import -> Maven -> Existing Maven project
```

## Steps to test the application:

1) Clone the Repository and do maven mvn clean install (if your using maven plugin means) this will create deployable war file under the target folder.
2) Install the tomcat server if you dont have means, After installation place the war file under the tomcat directory of /webapps and start the .bat file in case windows.
3) Then access the url for croos verifying the deployed application is accessible or not. <br>
  http://localhost:8080/Spring-Boot-App/
   
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

