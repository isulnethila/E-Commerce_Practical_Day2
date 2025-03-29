# IT3232 E_COMMERCE(P) Day02-2025/03/21

## Overview
This is a simple Spring Boot application that provides two REST API endpoints. It demonstrates the use of `@RestController`, `@RequestMapping`, and `@GetMapping` annotations.

## Technologies Used
- Java
- Spring Boot
- Maven

## Project Structure
```
lk.ac.vau.fas.ict.Controller
  |-- AppController.java
  |-- StudentController.java
```

## Setup and Running the Application
### Prerequisites
- Install Java (JDK 8 or later)
- Install Maven
- Install Spring Boot

### Steps to Run
1. Clone the repository or create a new Spring Boot project.
2. Ensure dependencies are installed via Maven.
3. Run the application using:
   ```sh
   mvn spring-boot:run
   ```
4. Access the endpoints in a browser or Postman:
   - `http://localhost:8080/app/msg` → Returns: **Hello SpringBoot**

     ## Output
     ![Screenshot (937)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/1.png?raw=true)

     
   - `http://localhost:8080/app/name` → Returns: **My name is SpringBoot**

     ## Output
     
        ![Screenshot (939)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/2.png?raw=true)

      - `http://localhost:8080/student/myname` → Returns: **My name is Isul**
    
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/3.png?raw=true)

       - `http://localhost:8080/app/age
    
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/4.png?raw=true)

     
       - `http://localhost:8080/app/student
    
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/5.png?raw=true)

      - `http://localhost:8080/app/students
    
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/6.png?raw=true)

      - `http://localhost:8080/app/students/2020ICT100
    
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/7.png?raw=true)

     - `http://localhost:8080/app/students/age
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/8.png?raw=true)

      - `http://localhost:8080/app/students/sort/gpa
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/9.png?raw=true)

     - `http://localhost:8080/app/students/add
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/10.png?raw=true)

      - `http://localhost:8080/app/students/update/2020ICT100
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/11.png?raw=true)

     - `http://localhost:8080/app/students/delete/2020ICT100
      ## Output
     
        ![Screenshot (938)](https://github.com/isulnethila/E-Commerce_Practical_Day2/blob/main/12.png?raw=true)




     

     

     








## License
This project is open-source and available for educational purposes.
