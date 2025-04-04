# Employee-Management-system
This is a Spring Boot-based backend application developed to efficiently manage employee data and user interactions. It supports core functionalities such as employee registration, search, and data management while maintaining a modular architecture and robust exception handling system. Additionally, the project integrates Thymeleaf for server-side rendering of dynamic content.

🛠️ Key Features
📦 RESTful APIs for performing all CRUD operations on employee records.

🗃️ Spring Data JPA for seamless database integration and persistent data storage.

👥 User Registration & Search functionality for better user interaction.

🚨 Global Exception Handling using Spring AOP to manage errors and provide meaningful responses.

🧩 Modular Architecture with well-structured layers:

Controllers

Services

Repositories

🖥️ Thymeleaf Integration

Server-side rendering for dynamic HTML content (useful for web-based dashboards or UI previews).

⚙️ Project Structure
📂 Main Application Classes
SpringbootEmployeeAllApplication.java:
The primary entry point of the employee management backend module.

SpringbootThymeleafEmployeeApplication.java:
Entry point for the Thymeleaf-based module (used for UI rendering).

📂 Controllers
EmployeeController.java
Manages API endpoints related to employee operations (add, update, delete, view).

RegistrationController.java
Handles user registration functionality.

SearchController.java
Manages search-related endpoints for employee data.

📂 Entities
Employee.java
Represents the Employee entity mapped to the database table.

MyUser.java
Represents the User entity, possibly used for authentication or role management.

📂 Repository
EmployeeRepository.java
Spring Data JPA repository interface for handling employee-related database operations.

⚙️ Configurations & Utilities
AppConfig.java
Contains application-level configurations such as beans and service definitions.

GlobalExceptionAdvive.java
Centralized exception handler using Spring AOP, ensuring clean error responses across the application.
