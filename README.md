# First Spring Boot Project 🚀

This is my first project in Spring Boot. The main goal of this repository is to initialize a Spring Boot project and understand its basic structure. It also serves as a guide for setting up VS Code for Spring Boot development.

## 📌 Project Overview

- This project demonstrates how to create a basic Spring Boot application.
- It includes a simple controller (`AppController`) that defines two endpoints:
  - `/app/msg` → Returns "Hello SpringBoot"
  - `/app/name` → Returns "My name is SpringBoot"
- Helps others learn how to set up VS Code for Spring Boot projects.

## 🛠️ Technologies Used

- **Spring Boot**
- **Java**
- **VS Code**

## 📂 Project Structure
```text
src/
├── main/
│   ├── java/lk/ac/vau/fas/ict/first/Controller/AppController.java
│   ├── resources/
│   │   ├── application.properties
├── pom.xml
├── README.md
```

## 🚀 How to Run the Project

1. **Clone the Repository**
   ```sh
   git clone https://github.com/LayuruLK/IT3232---SpringBoot-First-Project
   cd first-springboot-project

2. **Open the Project in VS Code**

  - Install the **Spring Boot Extension Pack** from VS Code Marketplace.
  - Make sure you have **Java** and **Maven** installed.

3. **Run the Application**
   ```sh
   mvn spring-boot:run

4. **Access the Endpoints**
   Open your browser and visit:

  - [http://localhost:8080/app/msg](http://localhost:8080/app/msg) → Displays **"Hello SpringBoot"**
- [http://localhost:8080/app/name](http://localhost:8080/app/name) → Displays **"My name is SpringBoot"**

## 📸 Output Screenshots

### 1️⃣ Message Endpoint (/app/msg)
  ![Hello SpringBoot](./Screenshots/Two.png)
### 2️⃣ Name Endpoint (/app/name)
  ![Hello SpringBoot](./Screenshots/One.png)

## 📌 Conclusion

This project is a great starting point for anyone new to Spring Boot. It provides a basic understanding of setting up a Spring Boot project in VS Code and creating RESTful endpoints.

## 📜 License

***This project is open-source and available for learning purposes.***





