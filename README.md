# Spring Boot Filters vs. Interceptors

## 📌 Overview
This project demonstrates the **differences between Filters and Interceptors** in Spring Boot. It provides examples of how each mechanism works, their use cases, and best practices for handling **request logging, authentication, API rate limiting, and request modifications**.

## 🚀 Features
- **Filter Example**: Demonstrates request pre-processing at the **Servlet level**.
- **Interceptor Example**: Shows how to modify requests before and after controller execution.
- **Comparison Guide**: Highlights when to use Filters vs. Interceptors.
- **Logging & Performance Monitoring**: Implements request timing analysis.

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Maven**

## 📂 Project Structure
```
spring-boot-filters-interceptors/
├── src/main/java/io/igventurelli/spring_boot_filters_interceptors
│   ├── filter/                 # Servlet Filters implementation
│   ├── interceptor/            # Spring Interceptor examples
│   ├── controller/             # Controllers to showcase behavior
│   ├── config/                 # Spring configuration for interceptors
│   └── DemoApplication.java    # Main Spring Boot application
```

## ⚡ Getting Started
### **Clone the Repository**
```sh
git clone https://github.com/igventurelli/examples.git
cd examples/spring-boot-filters-interceptors
```

### **Run with Maven**
```sh
mvn spring-boot:run
```

## 📜 License
This project is for educational purposes only and is not intended for production use without further optimization and testing.

