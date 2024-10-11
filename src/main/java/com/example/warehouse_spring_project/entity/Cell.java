package com.example.warehouse_spring_project.entity;

import jakarta.persistence.*;

@Entity
public class Cell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
