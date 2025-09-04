# Sideral Carrión University (USC)  

An application developed in **NetBeans** with **XAMPP** as the database in **MySQL**, designed for the fictitious academic management of Sideral Carrión University. This is a personal project awaiting potential use in an educational environment.  

---

## Table of Contents  
- [Project Description](#project-description)  
- [Features](#features)  
- [Prerequisites](#prerequisites)  
- [Installation](#installation)  
- [Usage](#usage)  
- [Contributions](#contributions)  
- [License](#license)  
- [Contact](#contact)  

---

## Project Description  
This personal project aims to create a system for academic management in a fictitious university, enabling the administration of students, teachers, courses, and enrollments.  

It is a development based on **Java** and **NetBeans**, using forms connected to a database managed with **XAMPP** (MySQL). The project license allows modifications exclusively for improvement purposes.  

---

## Features  
- ✔️ Student management: add and query.  
- ✔️ Teacher management: add and query.  
- ✔️ Course management: add, query, and assign teachers to courses.  
- ✔️ Enrollment: view and register enrollments for students.  
- ✔️ Login system with two user types: administrator and student.  

---

## Prerequisites  
1. **Read the attached PDF file**: **"Read before compiling the project"**.  
2. **NetBeans IDE**: Download and install the latest version from [https://netbeans.apache.org/](https://netbeans.apache.org/).  
3. **XAMPP**: Download and install from [https://www.apachefriends.org/](https://www.apachefriends.org/).  
4. **Java JDK**: Install a version compatible with NetBeans.  

---

## Installation  
Follow these steps to install and run the project on your local machine:

1. **Clone the repository:**  
   ```bash
   git clone https://github.com/gianpaaul/Sideral-University-Carrion.git
   
2. **Open the Project in NetBeans:**  
    2.1 **Launch NetBeans IDE.**  
    2.2 Click **File > Open Project**.  
    2.3 Select the **USC** folder from the cloned repository and open it.
   
3. **Configure the Database in XAMPP:**  
    3.1 **Start XAMPP** and activate **Apache** and **MySQL** modules.  
    3.2 Open **phpMyAdmin** from the XAMPP control panel.  
    3.3 Create a database named **usc**.  
    3.4 Import the provided **usc.sql** file from the cloned repository:  
        - Navigate to the **Import** tab.  
        - Select the **usc.sql** file.  
        - Click **Go** to complete the import.

4. **Final Configuration:**  
    4.1 Open the **`connection.java`** file in NetBeans.  
    4.2 Verify the database connection settings.  
    4.3 **Default settings:**  
    ```
    Host: localhost  
    User: root  
    Password: (empty by default unless configured otherwise)  
    Database: usc
    ```

        
5. **Run the Project:**  
    5.1 Press **F6** or click **Run** in NetBeans to compile and execute the project.

    
---
## Contributions
Contributions are welcome! Here's how you can contribute:
1. **Fork the repository.**
2. **Create your branch:**
    ```bash
    git checkout -b feature/NewFeature
3. **Make your changes and commit:**
    ```bash
    git commit -m 'Add new feature'
4. **Push to your branch:**
    ```bash
    git push origin feature/NewFeature
5. **Open a pull request.**
---
## Contact
 GitHub: (https://github.com/gianpaaul)

---
## License
This project is protected under GR copyrights. Modifications are allowed exclusively for improvement purposes under the terms described in the license file. See LICENSE for more details.
