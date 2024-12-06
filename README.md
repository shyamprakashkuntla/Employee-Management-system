# Employee-Management-system
This project is a Spring Boot-based backend application designed to manage employee data and user interactions. It includes features for employee registration, search, and management, with a focus on robust exception handling and modular architecture. The project also integrates Thymeleaf for server-side rendering of dynamic content.

The Employee Management System is a backend solution developed using Spring Boot, designed to simplify and automate the management of employee data for organizations. The application provides a user-friendly interface for administrators and managers to perform essential operations such as employee registration, updating details, and searching records efficiently.

 Key Features:
•	RESTful APIs for managing employee records.
•	Database integration for persistent storage using Spring Data JPA.
•	User registration and search functionalities.
•	Exception handling using Spring AOP.
•	Modular structure with controllers, services, and repositories.
      
  Main Application Class:
•	SpringbootEmployeeAllApplication.java: The main entry point of the application.
•	SpringbootThymeleafEmployeeApplication.java: Another entry point, possibly for a Thymeleaf-based module.

  Controllers:
•	EmployeeController.java:  handles employee-related operations.
•	RegistrationController.java:  functionality for user registration.
•	SearchController.java: Indicates search functionality for employees or related data.

 Entities:
•	Employee.java: Represents an employee entity, likely mapping to a database table.
•	MyUser.java: Suggests user-related functionality, possibly for authentication or authorization.

 Repository:
•	EmployeeRepository.java: A Spring Data repository for handling database operations related to employees.

 Configurations and Utilities:
•	AppConfig.java:  contains application-level configurations.
•	GlobalExceptionAdvive.java: Indicates centralized exception handling, likely using Spring AOP.
