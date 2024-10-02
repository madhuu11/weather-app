package com.madhu.weather_app.service;
//create weatherService class to fetch weather data from openWeatherMap API and save audit logs for cities like Chennai, Mumbai, Delhi, Bangalore, Hyderabad
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.madhu.weather_app.model.City;
import com.madhu.weather_app.model.WeatherAudit;
import com.madhu.weather_app.repository.CityRepository;
import com.madhu.weather_app.repository.WeatherAuditRepository;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

@Service
public class WeatherService {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private WeatherAuditRepository weatherAuditRepository;
    private static final String API_KEY = "b1b15e88fa797225412429c1c50c122a1";
    private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static final String APPID = "&appid=" + API_KEY;
    private static final String CHENNAI = "Chennai";
    private static final String MUMBAI = "Mumbai";
    private static final String DELHI = "Delhi";
    private static final String BANGALORE = "Bangalore";
    private static final String HYDERABAD = "Hyderabad";
    private static final String ENQUIRY_TYPE = "GET";
    private static final String ENQUIRY_AT = "http://localhost:8080/weather";
    private static final String ENQUIRY_AT_1 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_2 = "http://localhost:8080/weather/Mumbai";
    private static final String ENQUIRY_AT_3 = "http://localhost:8080/weather/Delhi";
    private static final String ENQUIRY_AT_4 = "http://localhost:8080/weather/Bangalore";
    private static final String ENQUIRY_AT_5 = "http://localhost:8080/weather/Hyderabad";
    private static final String ENQUIRY_AT_6 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_7 = "http://localhost:8080/weather/Mumbai";
    private static final String ENQUIRY_AT_8 = "http://localhost:8080/weather/Delhi";
    private static final String ENQUIRY_AT_9 = "http://localhost:8080/weather/Bangalore";
    private static final String ENQUIRY_AT_10 = "http://localhost:8080/weather/Hyderabad";
    private static final String ENQUIRY_AT_11 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_12 = "http://localhost:8080/weather/Mumbai";
//    private static final String ENQUIRY_AT_13 = "http://localhost:8080
    private static final String ENQUIRY_AT_14 = "http://localhost:8080/weather/Bangalore";
    private static final String ENQUIRY_AT_15 = "http://localhost:8080/weather/Hyderabad";
    private static final String ENQUIRY_AT_16 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_17 = "http://localhost:8080/weather/Mumbai";
    private static final String ENQUIRY_AT_18 = "http://localhost:8080/weather/Delhi";
    private static final String ENQUIRY_AT_19 = "http://localhost:8080/weather/Bangalore";
    private static final String ENQUIRY_AT_20 = "http://localhost:8080/weather/Hyderabad";
    private static final String ENQUIRY_AT_21 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_22 = "http://localhost:8080/weather/Mumbai";
    private static final String ENQUIRY_AT_23 = "http://localhost:8080/weather/Delhi";
    private static final String ENQUIRY_AT_24 = "http://localhost:8080/weather/Bangalore";
    private static final String ENQUIRY_AT_25 = "http://localhost:8080/weather/Hyderabad";
    private static final String ENQUIRY_AT_26 = "http://localhost:8080/weather/Chennai";
    private static final String ENQUIRY_AT_27 = "http://localhost:8080/weather/Mumbai";

    public void fetchWeatherData() {
        List<City> cities = cityRepository.findAll();
        for (City city : cities) {
            String cityName = city.getCityName();
            String url = URL + cityName + APPID;
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//            WeatherAudit weatherAudit = new WeatherAudit(cityName, response.getStatusCode().toString());
//            weatherAuditRepository.save(weatherAudit);
        }
    }

    public WeatherAudit getWeather(String city) {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(1);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }

    public WeatherAudit getWeatherChennai() {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(1);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT_1);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }

    public WeatherAudit getWeatherMumbai() {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(2);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT_2);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }

    public WeatherAudit getWeatherDelhi() {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(3);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT_3);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }

    public WeatherAudit getWeatherBangalore() {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(4);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT_4);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }

    public WeatherAudit getWeatherHyderabad() {
        WeatherAudit weatherAudit = new WeatherAudit();
        weatherAudit.setCityId(5);
        weatherAudit.setEnquiryType(ENQUIRY_TYPE);
        weatherAudit.setEnquiryAt(ENQUIRY_AT_5);
        weatherAuditRepository.save(weatherAudit);
        return weatherAudit;
    }


}
