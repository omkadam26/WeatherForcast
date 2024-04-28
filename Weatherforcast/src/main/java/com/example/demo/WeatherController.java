package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    private final String API_KEY = "0cabd9aa71msh1802b9d3d63d893p1fa53cjsn1088a7312a5a";
    private final String API_HOST = "forecast9.p.rapidapi.com";

    @GetMapping("/weather/forecast/summary")
    public ResponseEntity<String> getForecastSummaryByLocationName(
            @RequestParam String cityName,
            @RequestHeader("X-RapidAPI-Key") String apiKey,
            @RequestHeader("X-RapidAPI-Host") String apiHost) {

        if (!apiKey.equals(API_KEY) || !apiHost.equals(API_HOST)) {
            return ResponseEntity.status(401).body("Unauthorized");
        }

        String url = "https://forecast9.p.rapidapi.com/forecast/summary?q=" + cityName;
        return ResponseEntity.ok(new RestTemplate().getForObject(url, String.class));
    }

    @GetMapping("/weather/forecast/hourly")
    public ResponseEntity<String> getHourlyForecastByLocationName(
            @RequestParam String cityName,
            @RequestHeader("X-RapidAPI-Key") String apiKey,
            @RequestHeader("X-RapidAPI-Host") String apiHost) {

        if (!apiKey.equals(API_KEY) || !apiHost.equals(API_HOST)) {
            return ResponseEntity.status(401).body("Unauthorized");
        }

        String url = "https://forecast9.p.rapidapi.com/forecast/hourly?q=" + cityName;
        return ResponseEntity.ok(new RestTemplate().getForObject(url, String.class));
    }
  
    
}
