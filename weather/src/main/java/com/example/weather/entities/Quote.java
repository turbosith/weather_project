package com.example.weather.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Quote {
    @Column
    private Integer id;
    @Column
    private String authorName;
    @Column
    private String text;
}
