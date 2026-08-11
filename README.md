# Inventory & Order Management System

A backend system for managing product inventory, suppliers, and customer orders — built with Spring Boot, MySQL, and REST APIs.

## Problem It Solves

Small and mid-sized businesses often manage inventory manually, leading to overselling and stock mismatches. This system provides a centralized backend to track products, suppliers, and orders — automatically validating stock before confirming any order.

## Features

- **Product Management** — Create, view, update, and delete products with stock tracking
- **Supplier Management** — Maintain supplier records
- **Order Placement with Business Logic** — Validates stock, deducts automatically, rejects invalid orders
- **Relational Data Modeling** — Orders reference Products via Foreign Key

## Tech Stack

- **Language:** Java 21
- **Framework:** Spring Boot 4.1 (Spring Web, Spring Data JPA)
- **Database:** MySQL 8.0
- **Build Tool:** Maven
- **Testing Tool:** Postman

## API Endpoints

### Product
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /products | Add a new product |
| GET | /products | Get all products |
| PUT | /products/{id} | Update a product |
| DELETE | /products/{id} | Delete a product |

### Supplier
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /suppliers | Add a new supplier |
| GET | /suppliers | Get all suppliers |
| PUT | /suppliers/{id} | Update a supplier |
| DELETE | /suppliers/{id} | Delete a supplier |

### Order
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /orders?productId={id}&quantity={qty} | Place an order |
| GET | /orders | Get all orders |

## Getting Started

1. Clone the repository
2. Create a MySQL database named `inventory_db`
3. Copy `application.properties.example` to `application.properties` and add your MySQL password
4. Run `./mvnw spring-boot:run`
5. API available at `http://localhost:8080`

## What I Learned

Building this project helped me understand layered architecture (Controller-Service-Repository), relational database design with Foreign Keys, and implementing real business logic beyond basic CRUD.