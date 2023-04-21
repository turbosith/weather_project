package com.example.weather.controller;

import com.example.weather.entities.Quote;
import com.example.weather.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/weather")
public class Controller {
    @Autowired
    private QuoteService quoteService;


    private final RestTemplate restTemplate = new RestTemplate();
    @RequestMapping("get")
    public String getWeather(@RequestParam String lat, @RequestParam String lon){
        return "";
    }


    @RequestMapping("/quote")
    public Quote getQuote() {
        return quoteService.getRandomQuote();
    }
}
