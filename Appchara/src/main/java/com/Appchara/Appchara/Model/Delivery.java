package com.Appchara.Appchara.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Delivery {

    private @Id
    @GeneratedValue Long OrderId;
    private Long deliveryid;
    private Long productId;

    //constructors
    public Delivery(Long orderId, Long deliveryid, Long productId) {
        OrderId = orderId;
        this.deliveryid = deliveryid;
        this.productId = productId;
    }

    //constructors
    public Long getOrderId() {
        return OrderId;
    }

    public Long getDeliveryid() {
        return deliveryid;
    }

    public Long getProductId() {
        return productId;
    }

    //setters
    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setdeliveryid(Long deliveryid2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setdeliveryid'");
    }

}
