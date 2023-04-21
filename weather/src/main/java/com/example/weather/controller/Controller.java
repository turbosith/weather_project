package com.example.weather.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
@RequestMapping("/api/weather")
public class Controller {
    private final RestTemplate restTemplate = new RestTemplate();
    @RequestMapping("get")
    public String getWeather(@PathVariable @RequestParam String longitude, @RequestParam String latitude) throws UnirestException {

        String header1 = "97979f96-acea-40bc-9ae3-bd49fc07b9ca";
        HttpResponse httpResponse =
                (HttpResponse<String>) Unirest.get("https://api.weather.yandex.ru/v2/forecast/?lat="+latitude+"&lon="+longitude)
       .header("X-Yandex-API-Key", header1).asJsonAsync();
        System.out.println( );


        return (String) httpResponse.getBody();
    }


}
