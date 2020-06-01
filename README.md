# Spring-Boot-War-Deployment
This repo will demonstarte how to deploy the spring boot war file to apache tomcat server

## Running Spring rest locally

You can then access Restfull here: http://localhost:8080/Spring-Boot-App/


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment/issues


## Working with Rest in Eclipse

### Prerequisites
The following items should be installed in your system:
* Tool - STS(Spring Toot Suite) or Eclipse (Optional)
* Server - Apache Tomcat 7 or any version

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment.git
```
2) To Import the Praject Using STS or Eclipse. (This step is optional), Directly you can follow the below steps (Steps to test the application).
```
File -> Import -> Maven -> Existing Maven project
```

## Steps to test the application:

1) Clone the Repository and do maven `mvn clean install` (if your using maven plugin means or else find the one here (https://maven.apache.org/) this will create deployable war file under the target folder. <br>
2) Go to the tomcat directory `/webapps` and place the war file which is generated in previous step and start the .bat file(for windows), .sh file(Linux).  (If you dont have tomcat server means you can get it here http://tomcat.apache.org/) <br>
3) Then access the url for cros verifying the deployed application is accessible or not. <br>
    http://localhost:8080/Spring-Boot-App/
  <br>
  
  <img src="https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment/blob/master/docs/Pic1.png" width="100%">
   
   
   
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Spring-Boot-War-Deployment/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

