# 💻 Spring Core Project - Laptop Management System

This is a simple **Spring Core (Annotation-Based Configuration)** project that demonstrates the use of:
- Dependency Injection (DI)
- Component Scanning
- @Autowired Annotation
- Layered Architecture (Service + Bean)

---

## 🚀 Project Overview

This application simulates a basic laptop management system where:
- A `Laptop` object holds configuration details
- A `LaptopService` class accesses and displays those details
- Spring manages object creation and dependency injection

---

## 🛠️ Technologies Used

- Java
- Spring Core
- Annotation-based Configuration

---

## 📁 Project Structure


com.nit
│

├── config

│ └── AppConfig.java

│
├── sbeans

│ ├── Laptop.java

│ └── LaptopService.java

│
└── main

└── TestApp.java




---

## ⚙️ Configuration

Spring configuration is handled using Java-based configuration with `@Configuration` and `@ComponentScan`.

📄 File: AppConfig.java  
:contentReference[oaicite:0]{index=0}

---

## 📦 Components

### 🔹 Laptop (Bean Class)
- Annotated with `@Component`
- Stores laptop details like brand, processor, and RAM

📄 File: Laptop.java  
:contentReference[oaicite:1]{index=1}

---

### 🔹 LaptopService (Service Class)
- Annotated with `@Service`
- Uses `@Autowired` to inject Laptop dependency
- Prints laptop details

📄 File: LaptopService.java  
:contentReference[oaicite:2]{index=2}

---

## ▶️ Main Application

- Loads Spring container
- Retrieves beans from context
- Sets laptop details
- Calls service method to display data

📄 File: TestApp.java  
:contentReference[oaicite:3]{index=3}

---

## ▶️ How to Run

1. Clone the repository
2. Import into your IDE (Eclipse/IntelliJ)
3. Ensure Spring Core dependencies are added
4. Run `TestApp.java`

---

## 💡 Sample Output

Laptop Brand: Dell
Processor: Intel i7
Ram: 16 GB


---

## 📌 Key Concepts Demonstrated

- **@Component** → Marks a class as Spring Bean  
- **@Service** → Specialized component for service layer  
- **@Autowired** → Automatic dependency injection  
- **@Configuration** → Java-based configuration  
- **@ComponentScan** → Scans package for beans  

---

## 🎯 Conclusion

This project is a basic example of how Spring Core manages object creation and dependency injection using annotations. It helps in understanding the fundamental concepts required for building scalable Java applications.

---

## 📬 Author

Developed as part of learning Spring Framework 🚀
