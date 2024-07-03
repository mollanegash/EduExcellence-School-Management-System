EduExcellence-School-Management-System
A comprehensive School Management Software designed for EduExcellence, developed using Java, Spring Boot, Spring Web, Spring Data JPA, and H2 (in-memory database). This project implements a microservice architecture to manage students, including all CRUD operations.

Key Features Student Management: CRUD operations for student records REST APIs: Fetch all students Fetch a single student Create a new student Update a student Delete a student Microservices Architecture: Service registry/discovery Load balancing Circuit breaker Technologies Used: Java, Spring Boot, Spring Web, Spring Data JPA, H2 database Getting Started Prerequisites Java 8 or higher Maven Git Setup Instructions Clone the repository:

bash Copy code git clone https://github.com/mollanegash/EduExcellence-School-Management-System.git Navigate to the project directory:

bash Copy code cd EduExcellence-School-Management-System Install dependencies:

bash Copy code mvn clean install Run the application:

bash Copy code mvn spring-boot:run Access the application:

Open your web browser and navigate to http://localhost:8080 API Endpoints Fetch all students: GET /students Fetch a single student: GET /students/{id} Create a new student: POST /students Update a student: PUT /students/{id} Delete a student: DELETE /students/{id} Showcase Screenshots Login Page Student Home After Login Student Registration Student Enrollment in a Course Courses (JSON Format) License This project is licensed under the MIT License.

Contact For any questions or support, please contact:

Molla Negash mdraya3@gmail.com GitHub: https://github.com/mollanegash/
