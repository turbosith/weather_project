package com.example.weather.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="quotes")
public class Quote {
    @Column
    @Id
    private Integer id;
    @Column
    private String authorName;
    @Column
    private String text;
}
