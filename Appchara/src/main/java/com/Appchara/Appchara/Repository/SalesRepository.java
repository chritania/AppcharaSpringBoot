package com.Appchara.Appchara.Repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Appchara.Appchara.Model.Sales;

public interface SalesRepository extends JpaRepository <Sales, Long> {

    @Query("SELECT SUM(i.quantity) FROM Sales i")
    Long getTotalSalesCount();
    Long countBySaleDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    
}
