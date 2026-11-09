Pet Planet Adoption Puppy Portal CRUD Application

Purpose of Application 
The Pet Planet Adoption (PPA) Web Application is a database-driven puppy directory that allows pet shop staff members to view and manage puppy records through a website. The application presents puppy name, color, breed, and gender information and supports the complete Create, Read, Update, and Delete (CRUD) workflow. Pet shop staff can display the puppy directory, register a new puppy, update an existing record, and delete a record after a confirmation prompt. The project is developed in IntelliJ IDEA as a Java Spring Boot application. The presentation layer uses Thymeleaf templates and Bootstrap, the application logic is organized through controller, service, and repository layers, and Spring Data JPA connects the application to the local MySQL database named “ppa.” WAMPServer and phpMyAdmin are used to support and manage the local MySQL environment.

Problem 
Many pet stores rely on spreadsheets, paper records, or outdated systems to track adoptable animals. This can lead to difficulties managing available puppies. The Pet Planet Adoption (PPA) Web Application solves this problem by providing a management system that stores and manages puppy information.

Target Users and Needs 
Pet shop staff members and store managers need to be able to view available puppies, add new puppy records, update puppy information, delete puppy records, and access organized puppy information stored in the same database. Planned Application Features Functional Requirement #1 As a Staff User, I need to access the puppy directory, In order to view all the current puppy records stored in the PPA database. Given a staff user wants to review the Pet Planet Adoption puppy directory, When the staff or store manager opens /Puppies/list URL endpoint, Then the application retrieves puppy records and displays them in a table sorted by name. Functional Requirement #2 As a Staff User, I need to create a new puppy entry, In order to log a newly arrived puppy into the local MySQL database. Given a staff user wants to add a puppy to the system, When the staff or store manager opens the Add New Puppy form, inputs the puppy name, color, breed and gender, and selects Register, Then the application saves the record and redirects the user back to the list of puppies. Functional Requirement #3 As a Staff User, I need to update an existing puppy record, In order to correct or revise the animal’s information on their profile. Given a puppy record already exists in the system database, When the store manager or staff clicks Update and edits the pre-populated form, Then the application saves the updated record and returns the staff user to the main puppy directory. Functional Requirement #4 As a Staff User, I need to delete a puppy record, In order to remove a puppy after it has been adopted. Given a staff member or store manager clicks Delete for an existing puppy entry in the list, When the browser displays a deletion confirmation and the staff or shop manager confirms the action, Then the application removes the selected puppy from the database and reloads the active puppy directory.

Technology Stack 

<img width="643" height="471" alt="image" src="https://github.com/user-attachments/assets/89d87fa6-c1e7-46cf-bdd7-354251d07d12" />

Team Roles and Responsibilities 
Product Owner / Frontend Developer: Taylor Stargell – Defines project requirements and builds Thymeleaf and Bootstrap pages. 
Visual Designer / GitHub Repository Manager: Emily Cinnamon – Owns the shared GitHub repository. 
Scrum Master / UI: Jaylen Green – Manages project progress and designs wireframes and the user interface. 
Database Developer / Backend: Holden Kravitz – Develops backend functionality and verifies CRUD persistence. Maintains the MySQL database.


<img width="1143" height="246" alt="image" src="https://github.com/user-attachments/assets/0d9e6d22-7c86-4af6-86f2-07f6db847322" />
