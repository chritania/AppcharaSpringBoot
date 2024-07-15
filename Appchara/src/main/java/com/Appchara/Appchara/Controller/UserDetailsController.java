package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.UserDetails;
import com.Appchara.Appchara.NotFoundException.OrderDetailsNotFoundException;
import com.Appchara.Appchara.Repository.UserDetailsRepository;

@RestController
public class UserDetailsController {

    UserDetailsRepository repo;

    public UserDetailsController(UserDetailsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/User")
    public List<UserDetails> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/User/{id}")
    public UserDetails getOrder(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderDetailsNotFoundException(id));
    }
    @PostMapping("/User/new")
    public String addUser(@RequestBody UserDetails newUser){
        repo.save(newUser);
        return "A new user added. Yey!!!";
    }
    @DeleteMapping("/User/delete/{id}")
    public String deleteUser(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A user is deleted";
    }
}
