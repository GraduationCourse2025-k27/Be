# Website design for booking appointments and basic consulting support via chatbot

## OVERVIEW
-Based on the analysis requirements, we apply SpringBoot to write APIs that handle the functional business processes of this system. Other applications can use this API to retrieve data for display to users. This project helps me understand more about SpringBoot and the scrum process when working in a team.

## TIMELINE

-Estimate time:08/03/2025 - 15/05/2025

## TEAM SIZE

- 5 developer:
-Ho Phuc Tam
-Le Minh Dung
-Nguyen Tan Tai
-Nguyen Duc Hung
-Nguyen Thanh Nam

## TARGETs

-Process CRUD basic for function base
-Use Schedule for create schedule of doctor
-using Spring Security and jwt to build secure

## TECHNICAL STACK

-Jwt : create a token for account authentication
-Spring security : Authorize for roles and secure 
-Spring Data JPA : automate basic CRUD functions
-ORM : process creating data entities through code without needing to access the database

## REQUIREMENT DETAILS

-Read more detail requirement in here (https://drive.google.com/drive/u/2/folders/1FDvLgYtA16JavF-bCatFo78Wdvq5Uphd)

## EDITOR 

- [Visual studio code](https://code.visualstudio.com/)

## DIRECTORY STRUCTURE

├───main
│   ├───java
│   │   └───com
│   │       └───kltn
│   │           └───medicalwebsite
│   │               ├───controller
│   │               ├───entity
│   │               ├───exception
│   │               ├───repository
│   │               ├───request
│   │               ├───response
│   │               ├───service
│   │               ├───util
│   │               └───webconfig
│   └───resources
│       ├───static
│       └───templates
└───test
    └───java
        └───com
            └───kltn
                └───medicalwebsite

## GET STARTED

-clone project:
  $ git clone :https://github.com/GraduationCourse2025-k27/Be.git
- install maven
- install JDK 17
- run project:
- mvn -springboot:run


