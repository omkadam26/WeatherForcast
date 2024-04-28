package com.example.demo;

import java.util.Date;

public class WeatherHourlyForecast {
    private Date timestamp;
    private double temperature;
    private double humidity;
    private double precipitationChance;
    private double windSpeed;
    private String windDirection;

    // Constructor
    public WeatherHourlyForecast(Date timestamp, double temperature, double humidity,
                                 double precipitationChance, double windSpeed, String windDirection) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitationChance = precipitationChance;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    // Getters and setters
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipitationChance() {
        return precipitationChance;
    }

    public void setPrecipitationChance(double precipitationChance) {
        this.precipitationChance = precipitationChance;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    // You might also want to override toString() method to print the object's information
    @Override
    public String toString() {
        return "WeatherHourlyForecast{" +
                "timestamp=" + timestamp +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", precipitationChance=" + precipitationChance +
                ", windSpeed=" + windSpeed +
                ", windDirection='" + windDirection + '\'' +
                '}';
    }
}
