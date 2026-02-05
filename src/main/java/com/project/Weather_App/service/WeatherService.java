package com.project.Weather_App.service;

import com.project.Weather_App.DTO.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.forecast.url}")
    private String forecastUrl;


    private RestTemplate template = new RestTemplate();

    public String test(String city) {
        return "Weather API working for city: " + city;
    }

    public WeatherResponse getData(String city) {
        String url = apiUrl + "?key=" + apiKey + "&q=" + city;
        Root response = template.getForObject(url, Root.class);
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setCountry(response.getLocation().country);
        weatherResponse.setTempreature(Double.toString(response.getCurrent().temp_c));
        weatherResponse.setCondition(response.getCurrent().getCondition().getText());
        weatherResponse.setHumidity(Integer.toString(response.getCurrent().humidity) + "%");
        weatherResponse.setWindSpeed(response.getCurrent().wind_kph);
        weatherResponse.setFeelslike_c(response.getCurrent().feelslike_c);
        weatherResponse.setPrecip_mm(response.getCurrent().precip_mm);
        weatherResponse.setLast_updated(response.getCurrent().last_updated);

        if (response.getCurrent()==null) {
            throw new RuntimeException("Current weather data is missing from API response");
        }
        int isDay = response.getCurrent().is_day;
        weatherResponse.setIsDay(isDay);

        return weatherResponse;
    }

    public MyAppForecastResponse getForecastData(String city, int days) {

        String url = forecastUrl + "?key=" + apiKey + "&q=" + city+ "&days="+days;
        WeatherResponse weatherResponse = getData(city);
        MyAppForecastResponse response = new MyAppForecastResponse();
        response.setWeatherResponse(weatherResponse);
        Root apiResponse = template.getForObject(url,Root.class);
        Forecast forecast = apiResponse.getForecast();

        List<DayTemperature> dayList = new ArrayList<>();
        for(Forecastday day : forecast.getForecastday()){
            DayTemperature d = new DayTemperature();
            d.setDate(day.getDate());
            d.setMinTemp(day.getDay().mintemp_c);
            d.setMaxTemp(day.getDay().maxtemp_c);
            d.setAvgTemp(day.getDay().avgtemp_c);
            dayList.add(d);
        }
        response.setDayTemperature(dayList);
        return response;
    }

}