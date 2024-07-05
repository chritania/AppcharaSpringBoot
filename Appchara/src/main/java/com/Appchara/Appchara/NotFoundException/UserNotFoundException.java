package com.Appchara.Appchara.NotFoundException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long Id){
        super("User could not found with "+ Id);
    }

}