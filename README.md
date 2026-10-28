# JobTrack AI — Smart Job Application Tracker

An AI-powered job application management system built with Java, Spring Boot, MySQL, Spring AI, and Ollama.

JobTrack AI helps job seekers organize their applications, track application statuses, monitor company hiring updates, receive in-app notifications, and get career guidance through an AI assistant.

## ✨ Features

- **Job Application Tracking** — Add, view, update, and delete job applications.
- **Application Status Management** — Track progress across application stages.
- **Company Hiring Updates** — Store and view job openings and application deadlines.
- **In-App Notifications** — Receive notifications when new hiring updates are added.
- **Unread Notification Counter** — View unread notifications and mark them as read.
- **AI Career Assistant** — Ask career and placement preparation questions using a locally running AI model.
- **Dashboard** — View application statistics, including interviews, assessments, and offers.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Backend programming |
| Spring Boot | Backend application and REST APIs |
| Spring Data JPA | Database operations |
| MySQL | Relational database |
| Spring AI | AI integration |
| Ollama | Running the local AI model |
| Llama 3.2 (1B) | Language model |
| HTML, CSS, JavaScript | Frontend |
| Maven | Dependency and build management |
| IntelliJ IDEA | Development environment |

## 🏗️ Architecture

- **Frontend:** HTML, CSS and JavaScript
- **Backend:** Spring Boot REST APIs
- **Database:** MySQL
- **AI Integration:** Spring AI connected to Ollama

## 🚀 Getting Started

### Prerequisites

Install the following:

- JDK 21
- IntelliJ IDEA
- MySQL 8
- Git
- Ollama (for AI features)

### 1. Clone the repository

```bash
git clone https://github.com/sanjukumari11/jobtrack-ai.git
cd jobtrack-ai
```

### 2. Configure MySQL

Create a MySQL database named `jobtrack_db`.

Configure your database connection using local environment variables. Do not commit real database passwords or other secrets.

The application expects a database password through the `DB_PASSWORD` environment variable.

### 3. Configure Ollama

Install and start Ollama, then download the model:

```bash
ollama run llama3.2:1b
```

The default Ollama API address is:

```text
http://localhost:11434
```

Configure Spring AI to use the local Ollama instance in your local application configuration.

### 4. Run the application

Set the required environment variables, then run the Spring Boot application from IntelliJ IDEA or use the Maven wrapper:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

Open the application at:

```text
http://localhost:8081
```

> Note: The application requires a configured MySQL database. AI chat also requires Ollama to be running locally. Verify the local configuration before running the project.

## 🔗 API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/jobs` | Retrieve job applications |
| POST | `/api/jobs` | Create a job application |
| PUT | `/api/jobs/{id}` | Update a job application |
| DELETE | `/api/jobs/{id}` | Delete a job application |
| GET | `/api/openings` | Retrieve hiring updates |
| POST | `/api/openings` | Add a hiring update |
| GET | `/api/notifications` | Retrieve notifications |
| GET | `/api/notifications/unread-count` | Get unread notification count |
| PUT | `/api/notifications/{id}/read` | Mark a notification as read |
| POST | `/api/ai/chat` | Send a message to the AI assistant |

## 🔐 Security Notes

- Keep database passwords and API credentials out of version control.
- Use environment variables for local secrets.
- The AI assistant currently relies on a locally running Ollama instance.

## 🗺️ Future Improvements

- Improve AI response formatting and career-specific guidance.
- Add email notifications for hiring updates.
- Deploy the backend and frontend for public access.
- Add automated tests and improve API documentation.

👩‍💻 Author

Sanju Kumari

GitHub: [@sanjukumari11](https://github.com/sanjukumari11)

---

Built as a hands-on project to learn Java, Spring Boot, REST APIs, database integration, Git, and AI integration.
