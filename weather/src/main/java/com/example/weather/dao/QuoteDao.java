package com.example.weather.dao;

import com.example.weather.entities.Quote;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;

@Component
public class QuoteDao implements DAO<Quote> {

    @PersistenceContext
    @Getter(AccessLevel.PROTECTED)
    private EntityManager entityManager;



    @Override
    public Quote getById(Integer id) {
        EntityManager entityManager = getEntityManager();
        Quote quote = (Quote) entityManager.find(Quote.class, id);
        if (quote == null) {
            throw new IllegalArgumentException(Quote.class.getSimpleName() + " with id " + id + " is not found!");
        }
        return quote;
    }

    @Override
    public Integer getCount() {
        return Integer.parseInt(entityManager.createQuery("SELECT COUNT(*) FROM Quote quote").getSingleResult().toString());
    }
}
