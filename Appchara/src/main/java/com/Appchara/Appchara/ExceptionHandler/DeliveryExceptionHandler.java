package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.Appchara.Appchara.NotFoundException.DeliveryNotFoundException;

@RestControllerAdvice
public class DeliveryExceptionHandler {

    @ExceptionHandler(DeliveryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String DeliveryNotFoundException(DeliveryNotFoundException e){
        return e.getMessage();
    }

}
