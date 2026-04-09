# Automated Greenhouse Management System (AGMS)

## Introduction
The **Automated Greenhouse Management System (AGMS)** is a **cloud-based microservices application** built to manage and monitor greenhouse conditions efficiently. It connects with an external IoT platform to collect environmental data such as **temperature** and **humidity**, then uses that data to automate decisions inside the greenhouse.

This project demonstrates how **Spring Boot**, **Spring Cloud**, and **microservice architecture** can be combined to build a scalable smart agriculture solution.

---

## Key Functionalities

- Live monitoring of greenhouse environmental conditions
- Automatic control decisions based on predefined rules
- Zone-based management with custom threshold values
- Crop growth stage management from planting to harvesting
- Secure API communication with JWT-based authentication
- Service registration and discovery using Eureka
- Centralized API access through an API Gateway

---

## System Modules

### Infrastructure Services
These services handle the overall microservice environment:

- **Config Server**  
  Maintains centralized configuration for all services.

- **Eureka Server**  
  Registers and discovers all active microservices.

- **API Gateway**  
  Serves as the single entry point for routing client requests and securing APIs.

---

### Business Microservices

- **Zone Service** (`8081`)  
  Handles greenhouse zones and their environmental limits.

- **Sensor Service** (`8082`)  
  Connects with the external IoT provider and retrieves sensor readings.

- **Automation Service** (`8083`)  
  Processes incoming sensor values and decides whether automated actions are required.

- **Crop Service** (`8084`)  
  Manages crops and their growth stages inside the greenhouse.

---

## Core Features

### Environmental Monitoring
The system continuously reads:
- Temperature
- Humidity

These readings are collected through an external IoT API and used for further processing.

### Smart Automation
Based on the configured threshold values for each greenhouse zone, the system can trigger actions such as:
- Turning the **fan on**
- Turning the **heater on**

### Zone Management
Each greenhouse can be divided into multiple zones, where each zone can maintain:
- Minimum temperature
- Maximum temperature
- Minimum humidity
- Maximum humidity

### Crop Lifecycle Tracking
The platform allows crops to be managed through multiple growth stages, such as:
- Seedling
- Vegetative
- Flowering / Growing
- Harvested

---

## Technology Stack

### Backend
- Java
- Spring Boot
- Spring Cloud

### Security
- JWT Authentication

### Communication
- REST APIs
- OpenFeign

### Microservice Support
- Netflix Eureka
- Spring Cloud Gateway
- Spring Cloud Config

### Testing
- Postman

---

## External IoT Integration

The project integrates with a third-party IoT service to receive environmental sensor data.

**IoT API Base URL:**  
`http://104.211.95.241:8080/api`

This API provides:
- Temperature values
- Humidity values

Authentication is required when communicating with the provider.

---

## Project Workflow

1. The **Sensor Service** retrieves sensor data from the IoT provider at regular intervals.
2. The collected readings are forwarded to the **Automation Service**.
3. The **Automation Service** compares the values with the configured thresholds of each zone.
4. If a condition is violated, the system decides the appropriate response.
5. The result is logged and can be observed through the system.

---

## Running the Project

### Step 1 – Start Infrastructure Services
Run the following services first:

1. Config Server
2. Eureka Server
3. API Gateway

### Step 2 – Start Domain Services
After the infrastructure is ready, start:

1. Zone Service
2. Sensor Service
3. Automation Service
4. Crop Service

---

## API Testing
You can test the APIs using **Postman**.

- Import the provided Postman collection into Postman
- Send requests through the **API Gateway**
- Verify service communication and automation flow

---

## Eureka Dashboard
The Eureka dashboard can be used to confirm whether all services are successfully registered and running.

A screenshot of the dashboard can be added to the `docs` directory.

---

## Suggested Project Structure

```bash
AGMS/
├── config-server/
├── eureka-server/
├── api-gateway/
├── zone-service/
├── sensor-service/
├── automation-service/
├── crop-service/
└── 
