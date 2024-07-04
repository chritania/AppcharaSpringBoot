package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.Products;
import com.Appchara.Appchara.NotFoundException.ProductsNotFoundException;
import com.Appchara.Appchara.Repository.ProductsRepository;

@RestController
public class ProductsController {

    ProductsRepository repo;

    public ProductsController(ProductsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/Products")
    public List<Products> getProducts(){
        return repo.findAll();

    }

    @GetMapping("Products/{id}")
    public Products geProducts(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new ProductsNotFoundException(id));
    }

    @PostMapping("Products/new")
    public String addProducts(@RequestBody Products newProducts){
        repo.save(newProducts);
        return "A new product is added. Yey!!!!!";
    }

    @PutMapping("Products/edit/{id}")
    public Products updateProducts(@PathVariable Long id, @RequestBody Products newProducts){
        return repo.findById(id)
        .map(product ->{
            product.setProductname(newProducts.getProductname());
            product.setCategory(newProducts.getCategory());
            product.setStockquantity(newProducts.getStockquantity());
            product.setPrice(newProducts.getPrice());
            return repo.save(product);
        }).orElseGet(()->{
            return repo.save(newProducts);
        });
    }

    @DeleteMapping("Products/delete/{id}")
    public String deleteProducts(@PathVariable Long id){
        repo.deleteById(id);
        return "A product is deleted!";
    }
}
