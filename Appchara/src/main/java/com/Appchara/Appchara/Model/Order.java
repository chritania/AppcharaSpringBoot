package com.Appchara.Appchara.Model;
import java.util.Date;

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
    private Long totalAmount;
    private String Status;

    Order(){}


    public Order(Long userId,  double totalAmount, String status) {
        UserId = userId;
        totalAmount = totalAmount;
        Status = status;

    }

    //setters
    public void setUserId(Long userId) {
        UserId = userId;
    }

    public void setTotalAmount(Long totalAmount) {
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

    public Long getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return Status;
    }


}
