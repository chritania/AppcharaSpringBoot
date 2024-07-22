package com.Appchara.Appchara.Controller;


import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.DTO.BagDTO;
import com.Appchara.Appchara.Model.Bag;
import com.Appchara.Appchara.Model.Product;
import com.Appchara.Appchara.Repository.BagRepository;
import com.Appchara.Appchara.Repository.ProductRepository;


@RestController
@RequestMapping("api/v1/bag")
public class BagController {

    @Autowired
    BagRepository bagRepository;

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/new")
    public String addToBag(@RequestBody BagDTO entity) {
        Product product = productRepository.findByProductId(entity.getProductId());
        Bag bag = new Bag();
        bag.setProduct(Collections.singleton(product));
        bag.setUserId(entity.getUserId());
        bag.setNumberOfOrders(entity.getNumberOfOrders());
        bagRepository.save(bag);
        return "Added to bag!";
    }

    @GetMapping("/{userId}")
    public List<Bag> getBagItems(@PathVariable Long userId) {
        return bagRepository.findAllByUserId(userId);
    }
    
    
}