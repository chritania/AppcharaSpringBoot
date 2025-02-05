package com.Appchara.Appchara.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserDetailsNotFoundException extends RuntimeException {

    public UserDetailsNotFoundException(Long id) {
        super("Profile not found with ID: " + id);
    }

    public UserDetailsNotFoundException(String message) {
        super(message);
    }
}