
# Smart Contact Manager (SCM 2.0)

Smart Contact Manager is a full-stack **Spring Boot web application** that helps users securely store and manage their personal contacts in the cloud. The application provides authentication, contact management, image upload, and email services.

---

## 🚀 Features

* User Registration & Login
* Secure Authentication using **Spring Security**
* OAuth2 Login (Google authentication)
* Add, Update, Delete Contacts
* Search Contacts
* Contact Image Upload using **Cloudinary**
* Email Notification Support
* Form Validation
* Responsive UI using **Thymeleaf**
* Profile Management

---

## 🛠️ Tech Stack

### Backend

* Java 21
* Spring Boot 3
* Spring Security
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* HTML
* CSS
* JavaScript

### Database

* MySQL

### Cloud & Services

* Cloudinary (Image Storage)
* Spring Mail (Email Service)
* OAuth2 (Google Login)

### Build Tool

* Maven

---

## 📁 Project Structure

```
src/main/java/com/scm
│
├── config           # Security and application configuration
├── controllers      # Handles HTTP requests
├── entities         # JPA entity classes
├── forms            # Form DTO classes
├── helpers          # Utility/helper classes
├── repositories     # Spring Data JPA repositories
├── services         # Business logic layer
├── validators       # Custom validators
└── Application.java # Main Spring Boot application
```

```
src/main/resources
│
├── static           # CSS, JS, Images
├── templates        # Thymeleaf HTML templates
├── application.properties
├── application-dev.properties
└── application-prod.properties
```

---

## ⚙️ Installation & Setup

### 1 Clone the repository

```
git clone https://github.com/codebyharii/Smart-contact-manager.git
```

### 2 Navigate to project folder

```
cd Smart-contact-manager
```

### 3 Configure MySQL Database

Edit `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/scm
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 4 Configure Cloudinary

```
cloudinary.cloud-name=your_cloud_name
cloudinary.api-key=your_api_key
cloudinary.api-secret=your_api_secret
```

### 5 Run the application

```
mvn spring-b
```
