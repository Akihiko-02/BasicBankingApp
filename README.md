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


----

# Basic Banking Application

**Spring Boot** を使用して開発したシンプルな銀行管理REST APIです。

基本的なCRUD操作に加えて、**入金（Deposit）** と **出金（Withdraw）** の機能を実装しています。

このプロジェクトは、Spring Boot REST API、レイヤードアーキテクチャ、DTO、データベース連携について学習することを目的としています。

---

## 機能

* 新しい銀行口座の作成
* すべての口座情報の取得
* IDによる口座情報の取得
* 口座情報の更新
* 口座の削除
* 入金
* 出金
* RESTful API設計
* MySQLデータベースとの連携

---

## 使用技術

* Java 21（または使用しているJavaバージョン）
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven

---

## プロジェクト構成

```text
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

## APIエンドポイント

| Method | Endpoint                      | 説明        |
| ------ | ----------------------------- | --------- |
| POST   | `/api/accounts`               | 口座を作成     |
| GET    | `/api/accounts`               | すべての口座を取得 |
| GET    | `/api/accounts/{id}`          | IDで口座を取得  |
| PUT    | `/api/accounts/{id}`          | 口座情報を更新   |
| DELETE | `/api/accounts/{id}`          | 口座を削除     |
| PUT    | `/api/accounts/{id}/deposit`  | 入金        |
| PUT    | `/api/accounts/{id}/withdraw` | 出金        |

---

## 口座作成リクエストの例

```json
POST /api/accounts

{
    "accountHolderName": "John Doe",
    "balance": 1000
}
```

---

## 入金リクエスト

```json
PUT /api/accounts/1/deposit

{
    "amount": 500
}
```

---

## 出金リクエスト

```json
PUT /api/accounts/1/withdraw

{
    "amount": 200
}
```

---

## ⚙ インストール

### リポジトリをクローン

```bash
git clone https://github.com/your-username/basic-banking-app.git
```

### プロジェクトディレクトリへ移動

```bash
cd basic-banking-app
```

### MySQLの設定

`application.properties` ファイルを設定します。

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### アプリケーションを起動

```bash
mvn spring-boot:run
```

APIは以下のURLで起動します。

```text
http://localhost:8080
```

---

## テスト

以下のツールを使用してAPIをテストできます。

* Postman
* Insomnia
* Thunder Client
* cURL

---

## 学習目的

このプロジェクトでは、以下の内容を実装しています。

* Spring Boot REST APIの開発
* Controller・Service・Repositoryアーキテクチャ
* DTOパターン
* JPAを使用したEntityマッピング
* CRUD操作
* ビジネスロジックの実装（入金・出金）
* 例外処理
* MySQLとの連携

---

## 今後の改善

* JWT認証
* 取引履歴
* 口座間の送金
* Bean Validationによるバリデーション
* Global Exception Handling
* Swagger / OpenAPIによるAPIドキュメント
* Unit Test / Integration Test

---

## Author

Spring BootとREST API開発を学習するために作成した練習プロジェクトです。
