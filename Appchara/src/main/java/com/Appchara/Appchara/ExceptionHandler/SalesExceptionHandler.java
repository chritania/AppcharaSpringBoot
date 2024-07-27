package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.Appchara.Appchara.NotFoundException.SalesNotFoundException;



public class SalesExceptionHandler {
    @ExceptionHandler(SalesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String salesNotFoundException(SalesNotFoundException e){
        return e.getMessage();
    }

}