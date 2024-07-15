package com.Appchara.Appchara.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Delivery {

    private @Id
    @GeneratedValue Long OrderId;
    private Long UserId;
    private Long reservedid;
    private Long deliveryid;
    private Date orderdate;
    private double Totalamount;
    private String reservesStatus;
    private String Status;
    private String deliveryStatus;

    //constructors
    public Delivery(Long reservedid, Long deliveryid, Date orderdate, double totalamount, String reservesStatus,
            String status, String deliveryStatus) {
        this.reservedid = reservedid;
        this.deliveryid = deliveryid;
        this.orderdate = orderdate;
        Totalamount = totalamount;
        this.reservesStatus = reservesStatus;
        Status = status;
        this.deliveryStatus = deliveryStatus;
    }

    //setters
    public void setOrderId(Long orderId) {
        OrderId = orderId;
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

    public void setTotalamount(double totalamount) {
        Totalamount = totalamount;
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

    //getters
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

    public double getTotalamount() {
        return Totalamount;
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
