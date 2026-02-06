# Item API – Spring Boot REST Application

## Overview
A simple Spring Boot REST API to manage items.
Supports creating items and retrieving them using REST endpoints.

## Technologies
- Java 17
- Spring Boot 3.2.5
- Spring Web
- Spring Validation
- Maven

## Run Locally
1. Open project in IDE
2. Run `ItemApiApplication.java`
3. App runs on:
   http://localhost:8081

## API Endpoints

### Add Item
POST /items
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell"
}
