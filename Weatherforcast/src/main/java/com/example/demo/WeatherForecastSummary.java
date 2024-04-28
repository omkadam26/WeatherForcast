package com.example.demo;

public class WeatherForecastSummary {
    private String city;
    private String countryCode;
    private String weatherDescription;
    private double temperature;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "WeatherForecastSummary [city=" + city + ", countryCode=" + countryCode + ", weatherDescription="
				+ weatherDescription + ", temperature=" + temperature + "]";
	}
	public WeatherForecastSummary(String city, String countryCode, String weatherDescription, double temperature) {
		super();
		this.city = city;
		this.countryCode = countryCode;
		this.weatherDescription = weatherDescription;
		this.temperature = temperature;
	}
	public WeatherForecastSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
   
}