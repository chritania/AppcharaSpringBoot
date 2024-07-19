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
    private Long UserId;
    private double totalAmount;
    private String Status;

    Order(){}


    public Order(Long userId,  double totalAmount, String status) {
        this.UserId = userId;
        this.totalAmount = totalAmount;
        this.Status = status;

    }

    //setters
    public void setUserId(Long userId) {
        this.UserId = userId;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public void setStatus(String status) {
        Status = status;
    }

    //getters
    public Long getOrderId() {
        return OrderId;
    }
    public Long getUserId() {
        return UserId;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getStatus() {
        return Status;
    }
}
