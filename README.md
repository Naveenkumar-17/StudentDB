 # StudentDB

Welcome to **StudentDB**! This is a Java console application that uses MySQL to perform CRUD (Create, Read, Update, Delete) operations on a student database. The application provides an intuitive interface to manage student records efficiently.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

✨ **Create**: Add new student records to the database.  
🔍 **Read**: Retrieve and display student records.  
✏️ **Update**: Modify existing student records.  
🗑️ **Delete**: Remove student records from the database.  

## Prerequisites

Before you begin, ensure you have met the following requirements:
- ☕ Java Development Kit (JDK) 11 or higher
- 🐬 MySQL Server
- 📦 MySQL Connector/J (JDBC Driver)

## Installation

1. **Clone the Repository**
    ```sh
    git clone https://github.com/your-username/StudentDB.git
    ```
2. **Navigate to the Project Directory**
    ```sh
    cd StudentDB
    ```
3. **Set Up the Database**
    - Create a MySQL database named `studentdb`.
    - Import the provided `studentdb.sql` file to set up the table structure.
4. **Update Database Configuration**
    - Open `src/main/resources/db.properties`.
    - Update the database URL, username, and password.

## Usage

1. **Compile the Application**
    ```sh
    javac -cp .:mysql-connector-java-8.0.23.jar src/main/java/com/studentdb/Main.java
    ```
2. **Run the Application**
    ```sh
    java -cp .:mysql-connector-java-8.0.23.jar src/main/java/com/studentdb/Main
    ```

## Screenshots

📸 **Main Menu**  
![Main Menu](screenshots/options.png)

 

## Contributing

Contributions are always welcome!  
Feel free to fork this project, make improvements, and submit a pull request.

1. **Fork the Project**
2. **Create a Feature Branch**
    ```sh
    git checkout -b feature/YourFeature
    ```
3. **Commit Your Changes**
    ```sh
    git commit -m 'Add some feature'
    ```
4. **Push to the Branch**
    ```sh
    git push origin feature/YourFeature
    ```
5. **Open a Pull Request**

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

📧 **Your Name** - [your-email@example.com](mailto:your-email@example.com)  
🔗 **GitHub** - [https://github.com/Naveenkumar-17](https://github.com/your-username)  
🔗 **Project Link** - [https://github.com/Naveenkumar-17/StudentDB](https://github.com/your-username/StudentDB)

---

*Thank you for visiting StudentDB! We hope you find this application useful and easy to use.*
