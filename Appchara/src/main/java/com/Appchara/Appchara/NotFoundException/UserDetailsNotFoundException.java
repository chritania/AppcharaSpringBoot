package com.Appchara.Appchara.NotFoundException;

public class UserDetailsNotFoundException extends RuntimeException {
    public UserDetailsNotFoundException(Long Id){
        super("User could not found with "+ Id);
    }

}