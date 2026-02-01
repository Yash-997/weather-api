package com.project.Weather_App.DTO;

public class WeatherResponse {
    private String city;
    private String region;
    private String country;
    private String condition;
    private String tempreature;
    private String humidity;

    public WeatherResponse() {
    }

    public WeatherResponse(String city, String condition, String country, String region, String tempreature,String humidity) {
        this.city = city;
        this.condition = condition;
        this.country = country;
        this.region = region;
        this.tempreature = tempreature;
        this.humidity=humidity;
    }
    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTempreature() {
        return tempreature;
    }

    public void setTempreature(String tempreature) {
        this.tempreature = tempreature;
    }
}
