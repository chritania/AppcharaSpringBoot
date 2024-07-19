package com.Appchara.Appchara.Model;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bagId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_bag",
        joinColumns = 
            { @JoinColumn(name = "bag_id", referencedColumnName = "bagId")},
            inverseJoinColumns = 
            { @JoinColumn(name = "product_id", referencedColumnName = "productId")})
    private Set<Product> product;

    private Long userId;

    private int numberOfOrders;

    public Bag(){}

    public Long getBagId() {
        return bagId;
    }

    public Long getUserId() {
        return userId;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setBagId(Long bagId) {
        this.bagId = bagId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
