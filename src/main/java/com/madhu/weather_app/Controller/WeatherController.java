package com.madhu.weather_app.Controller;

// generate a rest controller with get method to get index html file with path of /

import com.madhu.weather_app.model.City;
import com.madhu.weather_app.model.WeatherAudit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WeatherController {
    @GetMapping("/home")
    public String index() {
        return "index";
    }

    // generate a get method to get weather audit details with path of /weatherAudit and return responseEntity
    // with status code 200
    @GetMapping("/weatherAudit")
    public ResponseEntity<WeatherAudit> getWeatherAudit() {
        return new ResponseEntity<WeatherAudit>(HttpStatus.OK);
    }

    // generate get method to return html file with path of /weather and return responseEntity with status code 200
    @GetMapping("/weather")
    public ResponseEntity<City> getWeather() {
        return new ResponseEntity<City>(HttpStatus.OK);
    }

//
}