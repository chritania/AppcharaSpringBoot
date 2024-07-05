package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Appchara.Appchara.NotFoundException.OrderDetailsNotFoundException;

@RestControllerAdvice
public class OrderDetailsExceptionHandler {

    @ExceptionHandler(OrderDetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String OrderNotFoundException(OrderDetailsNotFoundException e){
        return e.getMessage();
    }

}
