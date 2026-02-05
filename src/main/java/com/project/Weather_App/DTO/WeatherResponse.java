package com.project.Weather_App.DTO;

public class WeatherResponse {
    private String city;
    private String region;
    private String country;
    private String condition;
    private String tempreature;
    private String humidity;
    private int isDay;
    private double windSpeed;
    private double feelslike_c;
    private double precip_mm;
    private String last_updated;

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }


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

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public double getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public String getHumidity() {

        return humidity;
    }

    public void setHumidity(String humidity)
    {
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
