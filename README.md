# 📱 WhatsApp Chatbot Backend (Spring Boot)

## 🚀 Project Overview

This project is a simple WhatsApp chatbot backend simulation built using Spring Boot.
It receives user messages via a REST API and responds with predefined replies.

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* REST API
* HTML, CSS, JavaScript (Frontend UI)

---

## 📡 API Endpoint

### POST /webhook

#### 📥 Request

```json
{
  "message": "Hi"
}
```

#### 📤 Response

```json
{
  "reply": "Hello 👋"
}
```

---

## 💬 Features

* Accepts JSON messages
* Returns predefined chatbot responses
* Logs all incoming messages
* WhatsApp-style chatbot UI
* Multiple message handling (Hi, Bye, Help, etc.)

---

## 📸 Screenshots

<img width="1898" height="892" alt="Screenshot 2026-04-08 231542" src="https://github.com/user-attachments/assets/bf8d20d4-2382-4f9a-b33c-5ab85282c51a" />


---

## ▶️ How to Run Locally

1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Run the Spring Boot application

```bash
mvn spring-boot:run
```

4. Open browser:

```
http://localhost:8084
```

---

## 🎥 Demo

(Add your demo video link here)

---

## 👩‍💻 Author

Shreya Kesharwani
