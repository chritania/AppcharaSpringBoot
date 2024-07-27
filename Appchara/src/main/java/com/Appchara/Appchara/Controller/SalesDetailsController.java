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

import com.Appchara.Appchara.Model.SalesDetails;
import com.Appchara.Appchara.NotFoundException.SalesDetailsNotFoundException;
import com.Appchara.Appchara.Repository.SalesDetailsRepository;



@RestController
@RequestMapping("api/v1/salesdetails")
public class SalesDetailsController {
    
    private final SalesDetailsRepository repo;

    public SalesDetailsController(SalesDetailsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<SalesDetails> getSalesDetails() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public SalesDetails getSaleDetail(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(
                () -> new SalesDetailsNotFoundException(id));
    }

    @PostMapping("/create")
    public String create(@RequestBody SalesDetails newSaleDetail) {
        repo.save(newSaleDetail);
        return "A new sale detail is added.";
    }

    @PutMapping("/edit/{id}")
    public SalesDetails update(@PathVariable Long id, @RequestBody SalesDetails newSaleDetail) {
        return repo.findById(id)
                .map(saleDetail -> {
                    saleDetail.setProductId(newSaleDetail.getProductId());
                    saleDetail.setQuantity(newSaleDetail.getQuantity());
                    saleDetail.setPrice(newSaleDetail.getPrice());
                    return repo.save(saleDetail);
                }).orElseGet(() -> {
                    return repo.save(newSaleDetail);
                });
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "The sale detail is deleted!";
    }

}
