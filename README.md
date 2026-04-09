# 🌱 Automated Greenhouse Management System (AGMS)

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![Microservices](https://img.shields.io/badge/Architecture-Microservices-blue)](https://microservices.io/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

AGMS is a cloud-native, IoT-driven ecosystem designed to modernize precision agriculture. By leveraging a microservices architecture, the system provides real-time environmental monitoring and autonomous decision-making to optimize crop yields and reduce resource waste.

---

## 🏗️ System Architecture

The project follows a **distributed microservices pattern** using Spring Cloud for high availability and scalability.

### 🔹 Infrastructure Layer
* **Netflix Eureka:** Service discovery to allow microservices to find and communicate with each other.
* **Spring Cloud Gateway:** Central entry point for all clients, handling routing and cross-cutting concerns.
* **Config Server:** Centralized external configuration management for all environments.

### 🔹 Business Logic Layer
* **Zone Service:** Defines physical greenhouse boundaries and environmental setpoints.
* **Sensor Service:** The bridge between the IoT hardware and the cloud; polls real-time data from external APIs.
* **Automation Service:** The "Brain" of the system; evaluates sensor data against thresholds to trigger actuators (Fans, Heaters, etc.).
* **Crop Service:** Tracks the biological progress of plants from planting to harvest.

---

## 🚀 Key Features

* **Real-Time Data Pipeline:** Automatic IoT data fetching via external REST providers every 10 seconds.
* **Intelligent Automation:** Rule-based engine that minimizes human intervention by reacting to humidity/temperature fluctuations.
* **Lifecycle Management:** Comprehensive tracking of crop stages (Seedling, Vegetative, Flowering, Harvest).
* **State-of-the-Art Security:** Stateless authentication using **JWT (JSON Web Tokens)** enforced at the Gateway level.
* **Inter-service Communication:** Synchronous communication handled via **OpenFeign** clients.

---

## 🛠️ Tech Stack

| Category | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 3.x |
| **Cloud/Microservices** | Spring Cloud (Gateway, Eureka, Config) |
| **Security** | Spring Security, JWT |
| **Communication** | OpenFeign, REST |
| **Documentation** | Postman, Markdown |

---

## 🚦 Getting Started

### Prerequisites
* Java 17+
* Maven 3.6+
* Git

### Installation & Startup
To run the system locally, services must be started in the following specific order to ensure proper registration:

1.  **Clone the repository**
    ```bash
    git clone (https://github.com/PraveenRusiru/Automated-Greenhouse-Management-System-AGMS-.git)
    cd AGMS
    ```

2.  **Spin up Infrastructure**
    * Navigate to `config-server` and run `mvn spring-boot:run`
    * Navigate to `eureka-server` and run `mvn spring-boot:run`
    * Navigate to `api-gateway` and run `mvn spring-boot:run`

3.  **Launch Microservices**
    * Start `zone-service`, `sensor-service`, `automation-service`, and `crop-service` respectively.

4.  **Verification**
    * Access the Eureka Dashboard at `http://localhost:8761` to ensure all services are **UP**.

---

## 🧪 API Testing
A pre-configured **Postman Collection** is included in the `/docs` directory. 
1. Import the collection into Postman.
2. Generate a JWT token via the authentication endpoint.
3. Use the token to test the endpoints through the **API Gateway (Port 8080)**.

---

## 📂 Project Structure
```text
AGMS/
├── infrastructure/
│   ├── config-server/      # Centralized Configs
│   ├── eureka-server/      # Service Registry
│   └── api-gateway/        # Entry Point & Security
├── services/
│   ├── zone-service/       # Threshold Management
│   ├── sensor-service/     # IoT Data Polling
│   ├── automation-service/ # Logic & Rules
│   └── crop-service/       # Crop Tracking
└── docs/                   # Postman Collections & Screenshots
```
👨‍💻 Author
Praveen Rusiru -  Software Developer & Tech Enthusiast

📜 License
This project is licensed under the MIT License - see the LICENSE file for details.
