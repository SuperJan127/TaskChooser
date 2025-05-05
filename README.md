# com.jmrhub.taskchooser.TaskChooser
# TaskChooser Project

This project combines a **Java console-based task chooser app** and a **Spring Boot REST API** into a single backend system. It demonstrates both core Java programming and backend development skills.

---

## 📦 What's Included

- **TaskChooser.java** — A console-based app that allows users to select and manage tasks from the command line.
- **TaskList.java** — Internal logic for managing tasks in the console version.
- **Spring Boot REST API** — A fully functional backend service that provides CRUD operations for tasks with persistence.

---

## 🧰 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (file mode for persistence)
- Jakarta Bean Validation

---

## 📁 Project Structure

TaskChooser/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/jmrhub/taskchooser/
│ │ ├── TaskChooser.java # Console app
│ │ ├── TaskList.java # Console logic
│ │ ├── TaskmanagerApplication.java # Spring Boot main class
│ │ ├── controller/ # REST controller
│ │ ├── model/ # Task entity
│ │ └── repository/ # JPA repository
│ └── resources/
│ └── application.properties # Configs for DB + validation

yaml
Copy
Edit

---

## 🧪 API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/api/tasks`       | Get all tasks            |
| POST   | `/api/tasks`       | Create a new task        |
| PUT    | `/api/tasks/{id}`  | Update an existing task  |
| DELETE | `/api/tasks/{id}`  | Delete a task            |

---

## 🗃️ Database

- Uses **H2 (file mode)** for persistence
- You can access the H2 console at:

http://localhost:8080/h2-console

yaml
Copy
Edit

- **JDBC URL**: `jdbc:h2:file:./data/taskdb`
- **Username**: `sa`
- **Password**: *(leave blank)*

---

## 🧠 Future Plans

- Add a `User` entity and assign tasks to users
- Connect the console and API code
- Connect a frontend 
- Add authentication and role-based access
- Convert it to an android app

---

## 🙌 Author

Created by Janet Raphael as part of a Java bootcamp project to demonstrate full backend development using Spring Boot.