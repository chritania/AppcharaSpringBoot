package com.Appchara.Appchara.NotFoundException;

public class OrderDetailsNotFoundException extends RuntimeException {
    public OrderDetailsNotFoundException(Long Id){
        super("User could not found with "+ Id);
    }

}
