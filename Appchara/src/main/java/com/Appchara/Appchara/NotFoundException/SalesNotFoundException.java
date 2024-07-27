package com.Appchara.Appchara.NotFoundException;

public class SalesNotFoundException extends RuntimeException {
    public SalesNotFoundException(Long id){
        super("Could not fond product with " + id );
    }

}
