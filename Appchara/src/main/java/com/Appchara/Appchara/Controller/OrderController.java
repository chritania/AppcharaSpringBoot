package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.Order;
import com.Appchara.Appchara.NotFoundException.OrderNotFoundException;
import com.Appchara.Appchara.Repository.OrderRepository;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/All")
    public List<Order> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderNotFoundException(id));
    }
    @PostMapping("/new")
    public String addOrder(@RequestBody Order newOrder){
        repo.save(newOrder);
        return "A new order added. Yey!!!";
    }
    @PutMapping("/edit/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order newOrder){
        return repo.findById(id)
        .map(order ->{
            order.setUserId(newOrder.getUserId());
            order.setTotalAmount(newOrder.getTotalAmount());
            order.setStatus(newOrder.getStatus());
            return repo.save(order);
        }).orElseGet(()->{
            return repo.save(newOrder);
        });
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A order is deleted";
    }
}
