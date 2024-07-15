package com.Appchara.Appchara.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Appchara.Appchara.Model.TransactionHistory;
import com.Appchara.Appchara.NotFoundException.TransactionHistoryNotFoundException;
import com.Appchara.Appchara.Repository.TransactionHistoryRepository;



@RestController
public class TransactionHistoryController {

    TransactionHistoryRepository repo;

    public TransactionHistoryController(TransactionHistoryRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/TransactionHistory")
    public List<TransactionHistory> getTransactionHistory(){
        return repo.findAll();
    }
    @GetMapping("/TransactionHistory/{id}")
    public TransactionHistory getTransactionHistory(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new TransactionHistoryNotFoundException(id));
    }

}
