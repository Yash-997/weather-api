package com.project.Weather_App.DTO;

import java.util.List;

public class MyAppForecastResponse {
    private WeatherResponse weatherResponse;
    private List<DayTemperature> dayTemperature;

    public List<DayTemperature> getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(List<DayTemperature> dayTemperature) {
        this.dayTemperature = dayTemperature;
    }

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }
}
