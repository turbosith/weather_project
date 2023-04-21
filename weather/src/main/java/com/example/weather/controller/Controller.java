package com.example.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/weather")
public class Controller {
    private final RestTemplate restTemplate = new RestTemplate();
    @RequestMapping("get")
    public String getWeather(@RequestParam String lat, @RequestParam String lon){
        return "";
    }

}
