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


    }
    public void setUrl(String url) {
        this.url = url;
    }


    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    } 
}
