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

    private Class getEntityClass() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        return (Class) type.getActualTypeArguments()[0];
    }

    @Override
    public Quote getById(Integer id) {
        EntityManager entityManager = getEntityManager();
        Quote quote = (Quote) entityManager.find(getEntityClass(), id);
        if (quote == null) {
            throw new IllegalArgumentException(getEntityClass().getSimpleName() + " with id " + id + " is not found!");
        }
        return quote;
    }

    @Override
    public Integer getCount() {
        return Integer.parseInt(entityManager.createQuery("SELECT COUNT(q) FROM quotes q").getSingleResult().toString());
    }
}
