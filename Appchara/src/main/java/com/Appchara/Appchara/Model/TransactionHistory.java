package com.Appchara.Appchara.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class TransactionHistory {

    private @Id
    @GeneratedValue Long OrderId;
    private Long TransactionHistoryId;
    private Long ProductId;
    private Long UserId;
    private Long reservedId;
    private Long deliveryId;
    

    TransactionHistory(){}


    public TransactionHistory(Long orderId, Long transactionHistoryId, Long productId, Long userId, Long reservedId,
            Long deliveryId) {
        OrderId = orderId;
        TransactionHistoryId = transactionHistoryId;
        ProductId = productId;
        UserId = userId;
        this.reservedId = reservedId;
        this.deliveryId = deliveryId;
    }


    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }


    public void setTransactionHistoryId(Long transactionHistoryId) {
        TransactionHistoryId = transactionHistoryId;
    }


    public void setProductId(Long productId) {
        ProductId = productId;
    }


    public void setUserId(Long userId) {
        UserId = userId;
    }


    public void setReservedId(Long reservedId) {
        this.reservedId = reservedId;
    }


    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }


    public Long getOrderId() {
        return OrderId;
    }


    public Long getTransactionHistoryId() {
        return TransactionHistoryId;
    }


    public Long getProductId() {
        return ProductId;
    }


    public Long getUserId() {
        return UserId;
    }


    public Long getReservedId() {
        return reservedId;
    }


    public Long getDeliveryId() {
        return deliveryId;
    }
    
    

    

    
}
