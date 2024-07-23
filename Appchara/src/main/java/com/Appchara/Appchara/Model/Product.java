package com.Appchara.Appchara.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long productId; //Primary Key
    private String name;
    private String description;
    private double price;


    Product(){}


    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //setters
    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    //getters
    public Long getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }
} 
