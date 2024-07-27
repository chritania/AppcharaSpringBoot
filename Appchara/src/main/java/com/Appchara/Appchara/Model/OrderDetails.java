package com.Appchara.Appchara.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class OrderDetails {

    private @Id
    @GeneratedValue Long orderdetailsId;
    private Long orderId;
    private Long productId;
    private Long userId;
    private String numberOfOrders;
    private double totalAmount;


    OrderDetails(){}


    public OrderDetails(Long orderdetailsId, Long orderId, Long productId, Long userId, String numberOfOrders,
            double totalAmount) {
        this.orderdetailsId = orderdetailsId;
        this.orderId = orderId;
        this.productId = productId;
        this.userId = userId;
        this.numberOfOrders = numberOfOrders;
        this.totalAmount = totalAmount;
    }


    public Long getOrderdetailsId() {
        return orderdetailsId;
    }


    public void setOrderdetailsId(Long orderdetailsId) {
        this.orderdetailsId = orderdetailsId;
    }


    public Long getOrderId() {
        return orderId;
    }


    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    public Long getProductId() {
        return productId;
    }


    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getNumberOfOrders() {
        return numberOfOrders;
    }


    public void setNumberOfOrders(String numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }


    public double getTotalAmount() {
        return totalAmount;
    }


    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    

}