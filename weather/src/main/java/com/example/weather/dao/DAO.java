package com.example.weather.dao;

public interface DAO<T> {
     T getById(Integer id);

     Integer getCount();
}
