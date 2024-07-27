package com.Appchara.Appchara.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class Order {

    private @Id
    @GeneratedValue Long OrderId;
    private Long userId;
    private double totalAmount;

    Order(){}


    public Order(Long userId,  double totalAmount, String status) {
        this.userId = userId;
        this.totalAmount = totalAmount;

    }

    //setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    

    //getters
    public Long getOrderId() {
        return OrderId;
    }
    public Long getUserId() {
        return userId;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
}
