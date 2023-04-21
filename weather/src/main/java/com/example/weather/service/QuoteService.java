package com.example.weather.service;

import com.example.weather.dao.QuoteDao;
import com.example.weather.entities.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class QuoteService {
    @Autowired
    private QuoteDao quoteDao;
    public Quote getRandomQuote() {
        Integer size = quoteDao.getCount();
        Random random = new Random();
        Integer num = random.nextInt(size)+1;
        return quoteDao.getById(num);
    }
}
