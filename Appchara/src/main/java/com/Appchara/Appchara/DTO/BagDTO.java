package com.Appchara.Appchara.DTO;

public class BagDTO {
    private Long productId;
    private Long userId;
    private int numberOfOrders;

    BagDTO(){}

    public BagDTO(Long productId, Long userId, int numberOfOrders) {
        this.productId = productId;
        this.userId = userId;
        this.numberOfOrders = numberOfOrders;
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

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    
}
