# 📅 Smart Event Coordinator     

### **A web-based platform to efficiently create, manage, and track events with real-time RSVP and notifications.**     

**Smart Event Coordinator** helps organizers automate event workflows by managing event details, attendee RSVPs, and sending timely updates, ensuring smooth communication and enhanced event management.      

---                             
        
## 🌟 Key Features
   
### 🧑‍💼 For Organizers:   
* **Event Creation**: Create events with details like title, description, date, time, and location.
* **Attendee Management**: Track RSVP responses in real-time (accept/decline).
* **Custom Notifications**: Send personalized notifications and updates to attendees automatically.

### 🧑‍🤝‍🧑 For Attendees:
* **RSVP Interface**: Accept or decline event invitations easily.
* **Receive Updates**: Get real-time notifications for event changes or announcements.

---

## 🛠️ Technologies Used

### 1. Backend:
- **Java**: Business logic and core application development.
- **Spring Boot**: Simplified RESTful API creation and application framework.
- **Spring Data JPA**: Database ORM for managing event and user data.
- **Spring Scheduler**: Scheduling automated notification tasks.

### 2. Frontend:
- **HTML, CSS, Bootstrap**: Responsive and user-friendly interface design.
- **JavaScript**: Dynamic UI and client-side functionality.

### 3. Database:
- **MySQL**: Stores events, users, RSVP responses, and notifications data.

---

## 🚀 Setup and Run

### 1. Database:
- Install MySQL and create a database named smart_event_coordinator.
- Import the provided database.sql file to set up tables and initial data.

### 2. Application Configuration:
- Update application.properties with your MySQL credentials.

### 3. Running the Application:
- Use your IDE or run the command: mvn spring-boot:run

---

## 🧭 System Architecture

                       ┌───────────────────────────────┐
                       │         End Users             │
                       │  (Organizers & Attendees)     │
                       │     Web / Mobile Browser      │
                       └───────────────┬───────────────┘
                                       │
                     HTTPS Requests / REST APIs (JSON)
                                       │
                       ┌───────────────▼────────────────┐
                       │        Web Server Layer         │
                       │      (Spring Boot Backend)      │
                       │  Hosted on: AWS EC2 / Render /  │
                       │  Local Tomcat / Docker Container│
                       ├─────────────────────────────────┤
                       │ Controllers (REST APIs)         │
                       │ Services (Event, RSVP, Notify)  │
                       │ Scheduler (Spring Task)         │
                       └───────────────┬────────────────┘
                                       │
                     JDBC Connection / Hibernate ORM
                                       │
                       ┌───────────────▼────────────────┐
                       │        Database Server          │
                       │           (MySQL)              │
                       │   Stores:                      │
                       │   - events                     │
                       │   - users                      │
                       │   - RSVPs                      │
                       │   - notifications              │
                       └───────────────┬────────────────┘
                                       │
                         Asynchronous Notification Service
                                       │
                       ┌───────────────▼────────────────┐
                       │   Notification Engine (Spring) │
                       │   - Sends scheduled reminders  │
                       │   - Pushes real-time updates   │
                       └───────────────┬────────────────┘
                                       │
                 Optional Integrations / Future Enhancements
                                       │
                       ┌───────────────▼────────────────┐
                       │   External APIs / Services     │
                       │   - Email / SMS APIs (Twilio)  │
                       │   - Push Notification APIs     │
                       │   - Event Analytics Dashboard  │
                       └────────────────────────────────┘


---


## 📝 Current Status

- Basic event creation and RSVP tracking implemented.
- Notifications and scheduling under development.
- UI improvements planned for better user experience.

---

## 📷 Screenshots (Coming Soon)

- Screenshots will be added as development progresses.

---

## 🤝 Contributing
We welcome contributions from the community! Here's how you can contribute:

- Fork this repository.
- Open a pull request with your changes.

---

## 💬 Contact
* Developer: [Omkar Kulkarni](https://github.com/omkarkulkarni2704)
* Repository: [Smart Event Coordinator](https://github.com/omkarkulkarni2704/Smart-Event-Coordinator)

---
