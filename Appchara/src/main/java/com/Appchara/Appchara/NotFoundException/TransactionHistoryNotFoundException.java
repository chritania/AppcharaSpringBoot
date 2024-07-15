package com.Appchara.Appchara.NotFoundException;

public class TransactionHistoryNotFoundException extends RuntimeException {
    public TransactionHistoryNotFoundException(Long Id){
        super("Transaction could not found with "+ Id);
    }

}