# Spring-boot-one-to-one-api

This project demonstrates a simple Spring Boot application with a one-to-one bidirectional relationship between `Employee` and `Address` entities. The application includes CRUD operations and allows testing through Postman.
## Features

- Save employee data to the database
- Retrieve all records of employee and his address
- Retrieve combines data by name or by id
- Update data by id

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- postgreSQL Database (for testing purposes)
- Maven

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/KoushalKumar22/Spring-boot-one-to-one-api.git
   cd Spring-boot-one-to-one-api

2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: '/test'

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save Employee and Address
- URL: '/save'
- Method: POST
- Description: Save a new employee record to the database
- Request Body: json in postman
  ```sh
    {
        "name": "her",
        "age": 20,
        "address": {
            "city": "jamsheadpur",
            "state": "jharkhand"
        }
    }

3. Get All employee Records
- URL: '/all'
- Method: GET
- Description: Retrieve all employee records from the database
- Response: A list of employee objects and address
  
4. Get records by ID
- URL: '/id/{id}'
- Method: GET
- Description: Retrieve an employee record by its ID
5. Get Employee by Name
- URL: '/name/{name}'
- Method: GET
- Description: Retrieve an employee record by name


