Inventory & Order Management System

A backend system for managing product inventory, suppliers, and customer orders — built with Spring Boot, MySQL, and REST APIs. Automatically tracks and updates stock levels as orders are placed, enforcing real business rules at the database and application level.

🧩 Problem It Solves

Small and mid-sized businesses often manage inventory manually (spreadsheets, notebooks), leading to overselling, stock mismatches, and no order history. This system provides a centralized backend to track products, suppliers, and orders — automatically validating stock before confirming any order.

✨ Features
Product Management — Create, view, update, and delete products with stock quantity tracking
Supplier Management — Maintain supplier records (name, contact, address)
Order Placement with Business Logic:
Validates sufficient stock before confirming an order
Automatically deducts stock upon successful order placement
Rejects orders exceeding available stock, with no partial/incorrect data saved
Relational Data Modeling — Orders reference Products via a Foreign Key relationship, enforced at the database level
🛠️ Tech Stack
Language: Java 21
Framework: Spring Boot 4.1 (Spring Web, Spring Data JPA)
Database: MySQL 8.0
Build Tool: Maven
Testing Tool: Postman
Other: Lombok (reduces boilerplate code)
🏗️ Architecture

This project follows a standard layered Spring Boot architecture:

Client (Postman/Frontend)
        ↓
   Controller Layer   → Handles HTTP requests/responses
        ↓
    Service Layer      → Contains business logic (e.g., stock validation)
        ↓
  Repository Layer     → Handles database operations (Spring Data JPA)
        ↓
      MySQL Database
Entity Relationship
Product (1) ────< (Many) Order

Each Order references one Product via a Foreign Key (product_id), enforced with a database-level constraint.

📡 API Endpoints
Product
Method	Endpoint	Description
POST	/products	Add a new product
GET	/products	Get all products
PUT	/products/{id}	Update a product
DELETE	/products/{id}	Delete a product
Supplier
Method	Endpoint	Description
POST	/suppliers	Add a new supplier
GET	/suppliers	Get all suppliers
PUT	/suppliers/{id}	Update a supplier
DELETE	/suppliers/{id}	Delete a supplier
Order
Method	Endpoint	Description
POST	/orders?productId={id}&quantity={qty}	Place an order (validates & deducts stock)
GET	/orders	Get all orders
🚀 Getting Started
Prerequisites
Java 21+
Maven
MySQL 8.0+
Setup Instructions
Clone the repository
bash
git clone https://github.com/Rohini881-ui/inventory-management-system.git
Create a MySQL database
sql
CREATE DATABASE inventory_db;
Configure your database connection
Copy src/main/resources/application.properties.example to src/main/resources/application.properties
Replace YOUR_MYSQL_PASSWORD_HERE with your actual MySQL root password
Run the application
bash
./mvnw spring-boot:run
The API will be available at http://localhost:8080
🔮 Future Enhancements
User authentication and role-based access (Admin/Staff)
Frontend UI for easier interaction
Low-stock email alerts
Order history filtering and reporting
Unit and integration tests
📚 What I Learned

Building this project helped me understand real-world backend development — including layered architecture (Controller-Service-Repository pattern), relational database design with Foreign Keys, implementing business logic beyond basic CRUD operations, and safely managing application configuration/secrets in a Git workflow.