package com.Appchara.Appchara.Model;


import jakarta.persistence.*;


@Entity
@Table(name = "sales_details")
public class SalesDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_details_id")
    private Long id;

    
    @Column(name = "product_id")
    private Long productId;


    @Column(name = "quantity")
    private int quantity;


    @Column(name = "price")
    private double price;

    public SalesDetails() {
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
