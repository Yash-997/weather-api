##Weather API (Spring Boot)

A RESTful Weather API built using Spring Boot and Spring Web that provides current weather details and multi-day forecasts for a given city by integrating with an external weather service.

This backend is consumed by a custom frontend UI deployed separately.

🌍 Live Links
✅ Frontend (UI)

👉 https://atmos-app-indol.vercel.app/

✅ Backend (Spring Boot API)

👉 https://weather-api-1tct.onrender.com

⚠️ Note: The backend may take a few seconds to wake up on the first request due to Render’s free-tier cold start.

🚀 What This Project Does

Fetches current weather data for a city

Fetches weather forecast for upcoming days

Integrates with a real external Weather API

Returns clean, structured JSON responses

Uses DTO/POJO-based design

Follows Spring Boot layered architecture (Controller → Service → DTO)

🛠 Tech Stack

Java 17

Spring Boot

Spring Web

RestTemplate

Maven

Postman

Render (for deployment)

📡 API Endpoints
Method	Endpoint	Parameters	Description
GET	/weather/{city}	city (path)	Get current weather details for the given city
GET	/weather/forecast	city (query), days (query)	Get weather forecast for the given city and number of days
Example Requests
Current Weather
GET https://weather-api-1tct.onrender.com/weather/pune

Forecast
GET https://weather-api-1tct.onrender.com/weather/forecast?city=pune&days=3

📦 Sample Response (Current Weather)
{
  "city": "Pune",
  "condition": "Clear",
  "country": "India",
  "region": "Maharashtra",
  "tempreature": "24.3",
  "humidity": "28%",
  "feelslike_c": 24.1,
  "isDay": 0,
  "last_updated": "2026-02-05 21:00",
  "precip_mm": 0.0,
  "windSpeed": 4.3
}
