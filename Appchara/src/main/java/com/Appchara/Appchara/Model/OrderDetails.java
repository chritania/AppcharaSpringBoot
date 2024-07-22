package com.Appchara.Appchara.Model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class OrderDetails {

    private @Id
    @GeneratedValue Long OrderId;
    private Long UserId;
    private Long reservedid;
    private Long deliveryid;
    private Date orderdate;
    private double totalAmount;
    private String reservesStatus;
    private String Status;
    private String deliveryStatus;

    OrderDetails(){}

    

    public OrderDetails(Long userId, Long reservedid, Long deliveryid, Date orderdate, double totalAmount,
            String reservesStatus, String status, String deliveryStatus) {
        UserId = userId;
        this.reservedid = reservedid;
        this.deliveryid = deliveryid;
        this.orderdate = orderdate;
        this.totalAmount = totalAmount;
        this.reservesStatus = reservesStatus;
        Status = status;
        this.deliveryStatus = deliveryStatus;
    }
    public void setUserId(Long userId) {
        UserId = userId;
    }
    public void setReservedid(Long reservedid) {
        this.reservedid = reservedid;
    }
    public void setDeliveryid(Long deliveryid) {
        this.deliveryid = deliveryid;
    }
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    public void setTotalamount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setReservesStatus(String reservesStatus) {
        this.reservesStatus = reservesStatus;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public Long getOrderId() {
        return OrderId;
    }
    public Long getUserId() {
        return UserId;
    }
    public Long getReservedid() {
        return reservedid;
    }
    public Long getDeliveryid() {
        return deliveryid;
    }
    public Date getOrderdate() {
        return orderdate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getReservesStatus() {
        return reservesStatus;
    }
    public String getStatus() {
        return Status;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
