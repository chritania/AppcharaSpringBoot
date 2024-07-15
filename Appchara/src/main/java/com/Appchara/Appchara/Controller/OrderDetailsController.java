package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.OrderDetails;
import com.Appchara.Appchara.NotFoundException.OrderDetailsNotFoundException;
import com.Appchara.Appchara.Repository.OrderDetailsRepository;

@RestController
public class OrderDetailsController {

    OrderDetailsRepository repo;

    public OrderDetailsController(OrderDetailsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/Order")
    public List<OrderDetails> getOrders(){
        return repo.findAll();
    }
    @GetMapping("/Order/{id}")
    public OrderDetails getOrder(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderDetailsNotFoundException(id));
    }
    @PostMapping("/Order/new")
    public String addOrder(@RequestBody OrderDetails newOrder){
        repo.save(newOrder);
        return "A new order added. Yey!!!";
    }
    @PutMapping("Order/edit/{id}")
    public OrderDetails updateOrder(@PathVariable Long id, @RequestBody OrderDetails newOrder){
        return repo.findById(id)
        .map(order ->{
            order.setUserId(newOrder.getUserId());
            order.setReservedid(newOrder.getReservedid());
            order.setDeliveryid(newOrder.getDeliveryid());
            order.setOrderdate(newOrder.getOrderdate());
            order.setTotalamount(newOrder.getTotalamount());
            order.setReservesStatus(newOrder.getReservesStatus());
            order.setStatus(newOrder.getStatus());
            order.setDeliveryStatus(newOrder.getDeliveryStatus());
            return repo.save(order);
        }).orElseGet(()->{
            return repo.save(newOrder);
        });
    }
    @DeleteMapping("/Order/delete/{id}")
    public String deleteOrder(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A order is deleted";
    }
}
