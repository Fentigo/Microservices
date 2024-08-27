## Microservices 

## Table of contents  
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Getting Started](#gettingstarted)
4. [Installation](#installation)
5. [Running the Services](#runningtheservices)
6. [API Endpoints](#apiendpoints)
7. [Contributing](#contributing)

## 1. Introduction
This project demonstrates a microservice-based architecture, where individual services handle different aspects of a charity system. 
This repository contains the Accounts Service and Donations Service built using Spring Boot and MySQL.
The following services are included:
- **Accounts Service**: Handles user accounts, including registration and authentication.
- **Donations Service**: Manages donations made by users.

## 2. Prerequisites

To run the services, ensure you have the following installed:
- Java 11 or higher
- Maven
- MySQL
- Git
Both services connect to MySQL databases to store data.

## 3. Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Fentigo/Microservices.git
   cd Microservices

2. Install dependencies and build the project using Maven:
   ```bash
   mvn clean install
3. Set up the database for each service:
- Create a MySQL database for the **AccountsService**
  ```bash
  CREATE DATABASE accountsdb;
- Create a MySQL database for the **Donations Service**
4. Update the `application.properties` fileswith your MySQL credentials
  ```bash
    Provide instructions for running the services.
    ```markdown
    ## Running the Services
    
    1.**Start the Accounts Service**:
    cd accounts_service
    mvvn spring-boot:run
    2. **Start the Donations Service:**
    cd donations_service
    mvn spring-boot: run
Both services will start on differetn ports as configured in their respective `application.properties` files.
```bash

### **7. API Endpoints**

Describe the API endpoints of your services, including their HTTP methods, paths, and a brief description of what each endpoint does. You can also provide examples of the request and response.

```markdown
## API Endpoints

### Accounts Service
1. **Create Account**
   - **URL**: `/accounts`
   - **Method**: `POST`
   - **Description**: Registers a new account.
   - **Request Body**:
     ```json
     {
       "email": "user@example.com",
       "password": "securepassword",
       "firstName": "John",
       "lastName": "Doe"
     }
     ```
   - **Response**:
     ```json
     {
       "id": 1,
       "email": "user@example.com",
       "firstName": "John",
       "lastName": "Doe"
     }
     ```

2. **Get Account by ID**
   - **URL**: `/accounts/{id}`
   - **Method**: `GET`
   - **Description**: Fetches account details by account ID.

### Donations Service
1. **Create Donation**
   - **URL**: `/donations`
   - **Method**: `POST`
   - **Description**: Records a new donation made by a user.
   - **Request Body**:
     ```json
     {
       "userId": 1,
       "amount": 100.00,
       "message": "Happy to contribute!"
     }
     ```
   - **Response**:
     ```json
     {
       "donationId": 123,
       "userId": 1,
       "amount": 100.00,
       "message": "Happy to contribute!"
     }
     ```

### **8. Contributing (Optional)**

If you want others to contribute to the project, provide guidelines on how to do so.








