🌱 Automated Greenhouse Management System (AGMS)
📌 Overview
The **Automated Greenhouse Management System (AGMS)** is a **cloud-based microservices application** built to manage and monitor greenhouse conditions efficiently. It connects with an external IoT platform to collect environmental data such as **temperature** and **humidity**, then uses that data to automate decisions inside the greenhouse.

This project demonstrates how **Spring Boot**, **Spring Cloud**, and **microservice architecture** can be combined to build a scalable smart agriculture solution.

---


🎯 Features
🌡️ Real-time temperature & humidity monitoring
🤖 Rule-based automation (Fan/Heater control)
🏡 Zone management with environmental thresholds
🌱 Crop lifecycle tracking (Seedling → Vegetative → Harvested)
🔐 Secure API access using JWT authentication
⚡ Microservice architecture with service discovery
🏗️ System Architecture
🔹 Infrastructure Services
Eureka Server – Service Discovery
API Gateway – Centralized routing & security
Config Server – Centralized configuration management
🔹 Domain Microservices
Zone Service (8081) – Manage greenhouse zones & thresholds
Sensor Service (8082) – Fetch IoT data & push to automation
Automation Service (8083) – Rule engine for decision making
Crop Service (8084) – Manage crop lifecycle
⚙️ Technologies Used
Backend: Spring Boot, Spring Cloud
Security: JWT Authentication
Communication: OpenFeign / REST APIs
Config Management: Spring Cloud Config
Service Discovery: Netflix Eureka
API Testing: Postman
🔗 External IoT API
Base URL: http://104.211.95.241:8080/api
Provides real-time temperature & humidity data
Requires JWT authentication
🚀 How to Run the Project
1️⃣ Start Infrastructure Services
Start Config Server
Start Eureka Server
Start API Gateway
2️⃣ Start Microservices
Start Zone Service
Start Sensor Service
Start Automation Service
Start Crop Service
🔄 System Workflow
Sensor Service fetches IoT data every 10 seconds
Data is sent to Automation Service
Automation Service checks zone thresholds
Actions are triggered (Fan ON / Heater ON)
Logs are stored and displayed
📬 API Testing
Import the Postman Collection (.json) provided in this repository
Test all endpoints via API Gateway
📊 Eureka Dashboard
📷 Screenshot available in /docs folder showing all services running (Status: UP)

📁 Project Structure
AGMS/
 ├── config-server/
 ├── eureka-server/
 ├── api-gateway/
 ├── zone-service/
 ├── sensor-service/
 ├── automation-service/
 ├── crop-service/
 └── docs/
👨‍💻 Author
Praveen Rusiru Software Engineering Undergraduate

📜 License
This project is developed for academic purposes.
