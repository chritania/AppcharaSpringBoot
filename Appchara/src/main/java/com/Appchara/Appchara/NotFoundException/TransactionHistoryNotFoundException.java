package com.Appchara.Appchara.NotFoundException;

public class TransactionHistoryNotFoundException extends RuntimeException {
    public TransactionHistoryNotFoundException(Long Id){
        super("User could not found with "+ Id);
    }

}

