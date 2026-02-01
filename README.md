# Weather API

A RESTful Weather API built using **Spring Boot** and **Spring Web** that provides
current weather details and multi-day forecasts for a given city by integrating
with an external weather service.

---

## 🚀 What This Project Does

- Fetches **current weather data** for a city
- Fetches **weather forecast** for upcoming days
- Integrates with a **real external Weather API**
- Returns **clean, structured JSON responses**
- Uses **DTO/POJO-based design**
- Follows standard **Spring Boot layered architecture**

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- RestTemplate
- Maven
- Postman

---

## 📡 API Endpoints

| Method | Endpoint | Parameters | Description |
|------|---------|-----------|-------------|
| GET | `/weather/{city}` | `city` (path) | Get current weather details for the given city |
| GET | `/weather/forecast` | `city` (query), `days` (query) | Get weather forecast for the given city and number of days |



