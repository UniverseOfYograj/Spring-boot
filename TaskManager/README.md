# Dynamic Task Management Application (A Spring-Boot project by Yograj Tripathi)

![Spring Boot]

## Overview

This **Dynamic Task Management Application** is built using **Spring Boot** and provides a simple yet effective way to manage tasks. It allows users to create, read, update, and delete tasks seamlessly, utilizing an H2 in-memory database for storage.

## Features

- **Create Tasks**: Add new tasks with a title and description.
- **Retrieve Tasks**: Fetch all tasks or specific tasks by ID.
- **Update Tasks**: Modify existing tasks.
- **Delete Tasks**: Remove tasks as needed.
- **In-Memory Database**: Uses H2 for quick setup and testing.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interactions.
- **H2 Database**: Lightweight, in-memory database for development.
- **Postman**: Tool for API testing.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven or Gradle (for building the project)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/UniverseOfYograj/Spring-boot.git
   cd Spring-boot
Run the application:

Open the project in your IDE.
Run the TaskManagerApplication class.
Access the H2 Console:

Navigate to http://localhost:9090/h2-console.
Use the following credentials:
JDBC URL: jdbc:h2:mem:taskdb
Username: yograj
Password: password
API Endpoints
GET /api/tasks: Retrieve all tasks.
POST /api/tasks: Create a new task.
Request Body:
json
Copy code
{
    "title": "Yograj's Task",
    "description": "Yograj is expected to create Spring-boot project",
    "completed": true
}

GET /api/tasks/{id}: Retrieve a task by ID.
PUT /api/tasks/{id}: Update an existing task.
DELETE /api/tasks/{id}: Delete a task.

Testing the API->

Open Postman.

To create a new task, set the request method to POST and enter the URL: http://localhost:9090/api/tasks.
Add the task details in the Body section and click Send.
Verify the task creation by checking the H2 console with SELECT * FROM TASK;.
Conclusion
This application serves as a solid foundation for understanding RESTful services using Spring Boot. Feel free to explore, modify, and enhance the application!

License->
This project is licensed under the MIT License. See the LICENSE file for details.

Contact->
For any inquiries or feedback, please feel free to reach out:

Email: yograjtripathi1009@gmail.com
LinkedIn: https://www.linkedin.com/in/yograjtripathi9/
Thank you for checking out my project!

