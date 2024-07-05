package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.User;
import com.Appchara.Appchara.NotFoundException.OrderNotFoundException;
import com.Appchara.Appchara.Repository.UserRepository;

@RestController
public class UserController {

    UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/User")
    public List<User> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/User/{id}")
    public User getOrder(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderNotFoundException(id));
    }
    @PostMapping("/User/new")
    public String addUser(@RequestBody User newUser){
        repo.save(newUser);
        return "A new user added. Yey!!!";
    }
    @DeleteMapping("/User/delete/{id}")
    public String deleteUser(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A user is deleted";
    }
}
