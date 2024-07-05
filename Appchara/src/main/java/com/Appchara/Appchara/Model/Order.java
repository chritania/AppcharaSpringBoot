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
    public Long UserId;
    private double Totalamount;
    private String Status;

    Order(){}

    public Order(Long userId, double totalamount, String status) {
        UserId = userId;
        Totalamount = totalamount;
        Status = status;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public void setTotalamount(double totalamount) {
        Totalamount = totalamount;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public Long getUserId() {
        return UserId;
    }

    public double getTotalamount() {
        return Totalamount;
    }

    public String getStatus() {
        return Status;
    }

    

}
