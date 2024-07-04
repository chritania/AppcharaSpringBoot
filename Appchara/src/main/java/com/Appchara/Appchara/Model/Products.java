package com.Appchara.Appchara.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Products {

    private @Id
    @GeneratedValue Long id;
    private String productname;
    private String category;
    private int stockquantity;
    private double price;

    Products(){}

    

    public Products(String productname, String category, int stockquantity, double price) {
        this.productname = productname;
        this.category = category;
        this.stockquantity = stockquantity;
        this.price = price;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStockquantity(int stockquantity) {
        this.stockquantity = stockquantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public String getCategory() {
        return category;
    }

    public int getStockquantity() {
        return stockquantity;
    }

    public double getPrice() {
        return price;
    }

}
