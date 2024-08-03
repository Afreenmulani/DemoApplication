# DemoApplication
## Introduction
This is a Spring Boot project with MVC, Security, and Spring Data JPA support. The project includes JWT-based login for student and admin roles and uses an in-memory H2 database.

## Features
- Manage Students and Subjects
- Many-to-Many relationship between Students and Subjects
- REST API for creating and retrieving Students and Subjects
- JWT-based authentication for student and admin roles
- In-memory H2 database for easy setup and use

## Prerequisites
- Java 19+
- Maven
- Git

## Setup Instructions

### Cloning the Repository
1. Open your terminal or command prompt.
2. Clone the repository:
   git clone https://github.com/your-username/your-repository-name.git
3.Navigate to the project directory
cd your-repository-name
4.Building the Project
-Build the project using Maven:
-mvn clean install
-Running the Project
5.Run the project using Maven:
-mvn spring-boot:run
6.Access the application:
-Open your browser and navigate to http://localhost:8080
7.API Endpoints
Students
Create a Student: POST /students
Request Body Example:
{
  "name": "John Doe",
  "address": "123 Main St"
}
Get List of All Students: GET /students
Subjects
Create a Subject: POST /subjects
Request Body Example:
{
  "name": "Mathematics"
}
Get List of All Subjects: GET /subjects
Security
JWT-based authentication for student and admin roles
Use the following credentials for testing:
Student:
Username: student
Password: password
Admin:
Username: admin
Password: password





