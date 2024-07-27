package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.OrderDetails;
import com.Appchara.Appchara.Repository.OrderDetailsRepository;

@RestController
@RequestMapping("/api/v1/orderdetails")
public class OrderDetailsController {

    OrderDetailsRepository repo;

    public OrderDetailsController(OrderDetailsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/All")
    public List<OrderDetails> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/{id}")
    List <OrderDetails> getOrder(@PathVariable Long id){
        return repo.findAllByUserId(id);
    }
    @PostMapping("/new")
    public String addOrder(@RequestBody OrderDetails newOrder){
        repo.save(newOrder);
        return "A new order added. Yey!!!";
    }
}
