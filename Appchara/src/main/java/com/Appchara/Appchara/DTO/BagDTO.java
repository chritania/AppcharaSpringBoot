package com.Appchara.Appchara.DTO;

public class BagDTO {
    private String productName;
    private Long userId;
    private int numberOfOrders;

    BagDTO(){}

    public BagDTO(String productName, Long userId, int numberOfOrders) {
        this.productName = productName;
        this.userId = userId;
        this.numberOfOrders = numberOfOrders;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
