# CRUD Spring Boot Application

This is interview project for XTRAMILE utilizing java Spring Boot application that implements a CRUD (Create, Read, Update, Delete) backend for managing student information that provide RESTful web services for handling student data.

## Features

- **Create**: Add new student records to the system.
- **Read**: Retrieve existing student information.
- **Update**: Modify details of existing students.
- **Delete**: Remove student records from the system.

## Technologies Used

- **Java**: Programming language used for development.
- **Spring Boot**: Framework for building the backend application.
- **Spring Data JPA**: Provides interfaces for the persistence layer.
- **MySQL**: Relational database for storing student information.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK is installed on your system.
- **Maven**: Build automation tool for managing dependencies.
- **MySQL Database**: Set up a MySQL database for the application.

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/rifaset123/CRUD_Springboot.git

2. ** Configure the Database **:

1. **Create a database** named `xtramile_db` in your MySQL instance.
2. **Update the `application.properties` file** in the `src/main/resources` directory with your MySQL credentials:

   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3308/xtramile_db
    spring.datasource.username=root
    spring.datasource.password=root

   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

## API Endpoints

The following RESTful endpoints are available for managing students:

- **POST /student**: Create a new student record.
- **GET /students**: Retrieve a list of all students.
- **GET /student/{id}**: Retrieve details of a specific student by ID.
- **PUT /student/{id}**: Update information of an existing student.
- **DELETE /student/{id}**: Delete a student record by ID.

