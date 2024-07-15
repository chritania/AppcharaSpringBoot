package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.Delivery;
import com.Appchara.Appchara.NotFoundException.OrderDetailsNotFoundException;
import com.Appchara.Appchara.Repository.DeliveryRepository;

@RestController
public class DeliveryController {
    
    DeliveryRepository repo;

    public DeliveryController(DeliveryRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/Delivery")
    public List<Delivery> getDeliveries(){
        return repo.findAll();
    }
    @GetMapping("/Delivery/{id}")
    public Delivery getDelivery(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderDetailsNotFoundException(id));
    }

    @PostMapping("/Delivery/new")
    public String addDelivery(@RequestBody Delivery newDelivery){
        repo.save(newDelivery);
        return "A new delivery is added. Yey!!!";
    }
    @PutMapping("Delivery/edit/{id}")
    public Delivery updateDelivery(@PathVariable Long id, @RequestBody Delivery newDelivery){
        return repo.findById(id)
        .map(delivery ->{
            delivery.setProductId(newDelivery.getProductId());
            delivery.setdeliveryid(newDelivery.getDeliveryid());
            delivery.setOrderId(newDelivery.getOrderId());
            return repo.save(delivery);
        }).orElseGet(()->{
            return repo.save(newDelivery);
        });
    }
    @DeleteMapping("/Delivery/delete/{id}")
    public String deleteDelivery(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A delivery is deleted";
    }
    
}