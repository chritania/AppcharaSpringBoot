package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.Appchara.Appchara.NotFoundException.TransactionHistoryNotFoundException;

@RestControllerAdvice
public class TransactionHistoryExceptionHandler {

    @ExceptionHandler(TransactionHistoryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String TransactionHistoryException(TransactionHistoryNotFoundException e){
        return e.getMessage();
    }

}