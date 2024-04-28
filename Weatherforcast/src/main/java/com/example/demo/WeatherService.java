package com.example.demo;

public interface WeatherService {
    String getForecastSummary(String cityName);
    String getHourlyForecast(String cityName);
}


