package com.Appchara.Appchara.NotFoundException;

public class DeliveryNotFoundException extends RuntimeException {
    public DeliveryNotFoundException(Long Id){
        super("Delivery could not found with "+ Id);
    }

}
