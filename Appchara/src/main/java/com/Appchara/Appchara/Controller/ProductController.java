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
import com.Appchara.Appchara.Model.Product;
import com.Appchara.Appchara.NotFoundException.ProductNotFoundException;
import com.Appchara.Appchara.Repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/All")
    public List<Product> getProducts(){
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new ProductNotFoundException(id));
    }
    @PostMapping("/new")
    public String addUser(@RequestBody Product newProduct){
        repo.save(newProduct);
        return "A new user added. Yey!!!";
    }
    @PutMapping("/edit/{id}")
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
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long Id){
        repo.deleteById(Id);
        return "A user is deleted";
    }
}
