package com.project.Weather_App.controller;


import com.project.Weather_App.DTO.MyAppForecastResponse;
import com.project.Weather_App.DTO.WeatherResponse;
import com.project.Weather_App.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

@GetMapping("/{city}")
    public WeatherResponse getWeatherData(@PathVariable String city){
    return weatherService.getData(city);
}
    @GetMapping("/forecast")
    public MyAppForecastResponse getForecast(@RequestParam String city, @RequestParam int days){
        if(days<=0) throw new IllegalArgumentException("Not A Valid Input");
        return weatherService.getForecastData(city,days);
    }
}
