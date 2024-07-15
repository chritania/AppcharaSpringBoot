package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Appchara.Appchara.Model.Product;
import com.Appchara.Appchara.NotFoundException.ProductNotFoundException;
import com.Appchara.Appchara.Repository.ProductRepository;

@RestController
public class ProductController {

    ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/Product")
    public List<Product> getProducts(){
        return repo.findAll();
    }
    @GetMapping("/Product/{id}")
    public Product getProduct(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new ProductNotFoundException(id));
    }
    @PostMapping("/Product/new")
    public String addUser(@RequestBody Product newProduct){
        repo.save(newProduct);
        return "A new user added. Yey!!!";
    }
    @PutMapping("Product/edit/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product newProduct){
        return repo.findById(id)
        .map(product ->{
            product.setProductname(newProduct.getProductname());
                product.setDescription(newProduct.getDescription());
                product.setPrice(newProduct.getPrice());
                return product;
        }).orElseGet(()->{
            return repo.save(newProduct);
        });
    }
    @DeleteMapping("/User/delete/{id}")
    public String deleteUser(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A user is deleted";
    }
}
