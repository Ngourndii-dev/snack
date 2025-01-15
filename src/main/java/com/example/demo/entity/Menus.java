package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Menus {
    private int id;
    private String name;
    private Double price;
    private String taste;
    private String description;
    private String imageUrl;
    public Menus(String name, Double price, String taste, String description, String imageUrl) {
        this.name = name;
        this.price = price;
        this.taste = taste;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
