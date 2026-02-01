# Weather API

A simple RESTful Weather API built using **Spring Boot** and **Spring Web**.  
The application exposes city-based endpoints and returns structured weather information in JSON format.

---

## 🚀 What This Project Does

- Accepts a city name as input
- Returns weather details for that city
- Exposes REST endpoints using Spring Boot
- Uses clean DTO/POJO-based responses
- Designed as a backend foundation for real weather API integration

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Maven
- Postman (for testing)

---

## 📡 API Endpoint

### Get Weather by City

| Method | Endpoint | Description |
|------|---------|-------------|
| GET | `/weather/{city}` | Returns weather information for the given city |

---

### Example Request
### GET http://localhost:8080/weather/kolhapur

### Example Response
```json
{
  "city": "kolhapur",
  "condition": "Clear",
  "country": "India",
  "region": "Maharashtra",
  "temperature": "25.1",
  "humidity": "32%"
}

```

### How to rum
git clone https://github.com/Yash-997/weather-api.git



