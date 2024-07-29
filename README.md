# Flight Status Notification Management System
## Hack to Hire 2024 Case Study

**Name:** Rituraj Yadav  
**Date:** 30-07-2024

---

## Introduction
The Flight Status Management System is designed to provide passengers and airport personnel with real-time updates and notifications about flight statuses. This system integrates with airport systems, offers live flight status updates, and sends notifications through various channels such as SMS, email, and in-app alerts. The goal is to enhance the passenger experience by providing timely and accurate information.

---

## Problem Statement
Air travel can often be stressful due to uncertainties about flight schedules, gate changes, and delays. Passengers need real-time information to manage their travel plans effectively. The problem addressed by this project is the lack of a unified system that offers real-time flight status updates and notifications, ensuring that passengers and airport staff are informed and prepared for any changes.

---

## Features
- **Integration with Airport Systems:** The system seamlessly integrates with airport databases to fetch and update flight details and statuses.
- **Real-time Updates:** Provides live updates on flight statuses, including arrival and departure times, gate information, and delays.
- **Push Notifications:** Sends SMS, email, and in-app notifications to keep passengers informed about their flight status.

---

## Technologies Used
- **Frontend:** HTML, CSS, AngularJS
- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** MySQL
- **Notifications:** Kafka, Twilio

---

## System Architecture
- **Frontend:** Built with AngularJS for dynamic and responsive user interfaces.
- **Backend:** Developed with Java and Spring Boot for robust and scalable application logic.
- **Database:** Data stored in MySQL for flexible and reliable database management.
- **Notifications:** Twilio is used for real-time messaging and notifications.

---

## Implementation Details

### Real-time Updates
- Fetches flight status information from airport databases and updates the frontend in real time.
- Uses WebSocket connections to push updates to the client side as soon as they are available.

### Push Notifications
- Implemented using Twilio for efficient handling of message queues.
- Notifications can be sent via SMS, email, or in-app messages based on user preferences.
- The backend processes flight status changes and sends appropriate notifications through the Twilio message broker.

### Integration with Airport Systems
- Fetches data from airport systems through REST APIs.
- Periodically polls the airport databases for the latest flight information and updates the local database accordingly.
- Ensures up-to-date flight status information at all times.

---

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK)
- Spring Boot and Spring Data JPA 
- MySQL databases
- Apache Kafka

### Backend Setup
1. Clone the repository: [GitHub Repository](https://github.com/Riturajy2002/FlightStatusNotificationManagementSystem.git)
2. Navigate to the backend directory: `cd FlightStatusNotificationApplication`
3. Build the project: Use Maven to update the project.
4. Run the application: Run the project as a Spring Boot App.

### Frontend Setup
1. Navigate to the frontend directory: `cd src/main/resources/static`
2. Install dependencies: Use CDN in `index.js` for required libraries.

### Database Setup
1. Install MySQL Workbench.
2. Create the `flightdb` database and tables using the provided SQL scripts in the `db-scripts` directory.
3. Configure the database connections in the `application.properties` file for the backend.

---

## Usage
1. Open a web browser and navigate to `http://localhost:8080`.
2. Select a flight number from the dropdown to view its details.
3. Click on the "Show Details" button to see the flight information.
4. Click on the "Status" button to view the current flight status.
5. Notifications will be sent automatically based on the flight status updates after clicking the Notification button.

---

## Demo

### Flight Information Screen
- Select a flight code from the dropdown.
- Click on "Show Details" to view flight status including flight name, source, destination, capacity, class name, and price.
- Click on the "Status" button to view real-time status.

### Flight Status Screen
- Shows real-time status including arrival and departure times, gate number, and current status.
- Click on the "Share Notification" button to send notifications.

### Notification Example
- SMS notification received after clicking the "Share Notification" button.

---

## Conclusion
The Flight Status Management System provides a comprehensive solution for real-time flight updates and notifications. It enhances the passenger experience by delivering timely information and ensuring passengers are well-informed about any changes to their flights. This system demonstrates the effective use of modern web technologies and real-time messaging to solve a common problem in air travel.

---

## PDF Documentation
For detailed information, you can refer to the [PDF Documentation](https://drive.google.com/file/d/1fI7xDcPB7lR_7bQmrnMuz1lUyleBui6A/view?usp=sharing).

---
