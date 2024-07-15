package com.Appchara.Appchara.NotFoundException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long Id){
        super("User could not found with "+ Id);
    }

}
