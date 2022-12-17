package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private long id;
    private String title;
    private int number;
    private String description;
    private double price;
    private String city;
    private String authorName;
}
