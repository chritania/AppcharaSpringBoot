package com.Appchara.Appchara.NotFoundException;

public class ProductsNotFoundException extends RuntimeException {
    public ProductsNotFoundException(Long id){
        super("Could not found product wuth " + id);
    }

}
