# Demo App

Demo App is a Java application that fetches "users" and their "posts" information from https://jsonplaceholder.typicode.com/
and it renders the information in a user-friendly way.

## Requisites

- Maven 3
- Java JDK 8+

## How to run

You will first need to browse to the application's root folder using the command line
```bash
cd demo
```
Once in the application's root folder, run the following Maven command
```bash
mvn spring-boot:run
```
The application will start up in port 8080 and will be accessible on http://localhost:8080.

## Usage

Open your preferred browser and go to http://localhost:8080. This will list all the available users.

From there, navigate the user's posts by clicking the "posts" icon for each user