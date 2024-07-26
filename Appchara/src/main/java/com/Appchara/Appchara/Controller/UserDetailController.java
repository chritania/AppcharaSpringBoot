package com.Appchara.Appchara.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.DTO.UserDetailsDTO;
import com.Appchara.Appchara.Model.UserAuth;
import com.Appchara.Appchara.Model.UserDetails;
import com.Appchara.Appchara.Repository.UserAuthRepository;
import com.Appchara.Appchara.Repository.UserDetailsRepository;

@RestController
@RequestMapping("api/v1/user-detail")
public class UserDetailController {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    UserAuthRepository userAuthRepository;

    @PostMapping("/new")
    public ResponseEntity<?> addUserDetailEntity(@RequestBody UserDetailsDTO entity) {
        UserDetails userDetails = new UserDetails(
            entity.getMobileNum(), 
            entity.getAddress(), null
        );
        UserAuth userAuth = userAuthRepository.findByEmail(entity.getEmail());
        userDetails.setUser(userAuth);
        userDetailsRepository.save(userDetails);
        return new ResponseEntity<>("User details added successfully", HttpStatus.OK);
    }

    //Get user detail
    @GetMapping("/{email}")
    public HashMap<String, String> getUser(@PathVariable String email) {
        UserAuth userAuth = userAuthRepository.findByEmail(email);
        UserDetails userdetails = userDetailsRepository.findByUser(userAuth);

        HashMap<String, String> profile = new HashMap<String, String>();

        profile.put("name", userAuth.getUsername());
        profile.put("mobileNum", userdetails.getMobileNum());
        profile.put("address", userdetails.getAddress());

        return profile;
    }
    
    //Get user account
    @GetMapping("/account/{email}")
    public Long getUserAccount(@PathVariable String email) {
        UserAuth userAuth = userAuthRepository.findByEmail(email);
        return userAuth.getId();
    }
    
    
}