package com.project.Weather_App.service;

import com.project.Weather_App.DTO.Root;
import com.project.Weather_App.DTO.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private RestTemplate template = new RestTemplate();
    public String test(String city) {
        return "Weather API working for city: " + city;
    }

    public WeatherResponse getData(String city){
        String url = apiUrl+"?key="+apiKey+"&q="+city;
        Root response = template.getForObject(url,Root.class);
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setCountry(response.getLocation().country);
        weatherResponse.setTempreature(Double.toString(response.getCurrent().temp_c));
        weatherResponse.setCondition(response.getCurrent().getCondition().getText());
        weatherResponse.setHumidity(Integer.toString(response.getCurrent().humidity)+"%");
        return weatherResponse;
    }
}
