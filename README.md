# Basic Banking Application

A simple Banking REST API built with **Spring Boot** that demonstrates basic CRUD operations along with **Deposit** and **Withdraw** functionalities.

This project is intended for learning Spring Boot REST APIs, layered architecture, DTOs, and database integration.

---

## Features

- Create a new bank account
- View all accounts
- View account by ID
- Update account details
- Delete an account
- Deposit money
- Withdraw money
- RESTful API design
- MySQL database integration

---

## Tech Stack

- Java 21 (or your Java version)
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## Project Structure

```
src
├── controller
├── dto
├── entity
├── exception
├── mapper
├── repository
├── service
│   ├── AccountService
│   └── impl
└── BasicBankingApplication
```

---

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/accounts` | Create account |
| GET | `/api/accounts` | Get all accounts |
| GET | `/api/accounts/{id}` | Get account by ID |
| PUT | `/api/accounts/{id}` | Update account |
| DELETE | `/api/accounts/{id}` | Delete account |
| PUT | `/api/accounts/{id}/deposit` | Deposit money |
| PUT | `/api/accounts/{id}/withdraw` | Withdraw money |

---

## Sample Create Account Request

```json
POST /api/accounts

{
    "accountHolderName": "John Doe",
    "balance": 1000
}
```

---

## Deposit Request

```json
PUT /api/accounts/1/deposit

{
    "amount": 500
}
```

---

## Withdraw Request

```json
PUT /api/accounts/1/withdraw

{
    "amount": 200
}
```

---

## ⚙Installation

### Clone the repository

```bash
git clone https://github.com/your-username/basic-banking-app.git
```

### Navigate to the project

```bash
cd basic-banking-app
```

### Configure MySQL

Update the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the application

```bash
mvn spring-boot:run
```

The API will start on:

```
http://localhost:8080
```

---

## Testing

You can test the API using:

- Postman
- Insomnia
- Thunder Client
- cURL

---

## Learning Objectives

This project demonstrates:

- Spring Boot REST API development
- Controller-Service-Repository architecture
- DTO pattern
- Entity mapping with JPA
- CRUD operations
- Business logic implementation (Deposit & Withdraw)
- Exception handling
- MySQL integration

---

## Future Improvements

- JWT Authentication
- Transaction History
- Money Transfer Between Accounts
- Validation using Bean Validation
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Unit & Integration Testing

---

## Author

Developed as a practice project to learn Spring Boot and REST API development.
