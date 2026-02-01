package com.project.Weather_App.controller;


import com.project.Weather_App.DTO.Root;
import com.project.Weather_App.DTO.WeatherResponse;
import com.project.Weather_App.WeatherAppApplication;
import com.project.Weather_App.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

@Autowired
    private WeatherService weatherService;

@GetMapping("/{city}")
    public WeatherResponse getWeatherData(@PathVariable String city){
    return weatherService.getData(city);
}
}
