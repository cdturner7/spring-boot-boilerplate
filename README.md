# spring-boot-boilerplate
This is a repo designed to clone when I need to start a new spring boot application and dont want to rewrite boilerplate code

This repository provides a clean, production-ready boilerplate for quickly starting new Spring Boot web applications. It includes common configurations, directory structure, and starter dependencies so you can focus on building features instead of setup.

## 🔧 Features

- Java 21 and Spring Boot latest version
- Maven-based project structure
- Thymeleaf for HTML templating
- REST controller starter structure
- Global exception handling
- Basic logging configuration (Logback)
- Application properties split into `dev` and `prod` profiles
- Error page customization starter (404, 500, etc.)

## 📁 Project Structure

src/
├── main/
│ ├── java/com/cgwd/boilerplate/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── model/
│ │ ├── config/
│ │ └── Application.java
│ └── resources/
│ │ ├── css/
│ │ ├── scripts/
│ │ ├── application.properties
│ │ ├── application-dev.properties
│ │ └── application-prod.properties
│ ├── static/
│ ├── templates/
└── test/
│ └── java/com/cgwd/boilerplate/


## 🚀 Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/cdturner7/spring-boot-boilerplate.git
   cd spring-boot-boilerplate

2. **Update package name and metadata:**

  Replace com.cgwd.boilerplate with your desired package name throughout the codebase and pom.xml.

3. **Build and Run:**

  ./mvnw spring-boot:run

4. **Clone the repository:**

  Open http://localhost:8080 in your browser.
  
   
##  Testing

  Run unit tests with:
  ./mvnw test

