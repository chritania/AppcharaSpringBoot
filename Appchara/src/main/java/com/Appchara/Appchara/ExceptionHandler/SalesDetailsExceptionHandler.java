package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.Appchara.Appchara.NotFoundException.SalesDetailsNotFoundException;



public class SalesDetailsExceptionHandler {
    @ExceptionHandler(SalesDetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String salesDeatailsNotFoundException(SalesDetailsNotFoundException e){
        return e.getMessage();
    }

}