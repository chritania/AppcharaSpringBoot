package com.Appchara.Appchara.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Appchara.Appchara.NotFoundException.ProductsNotFoundException;

@RestControllerAdvice
public class ProductsExceptionHandler {

    @ExceptionHandler(ProductsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ProductsNotFoundException(ProductsNotFoundException e){
        return e.getMessage();
    }

}
