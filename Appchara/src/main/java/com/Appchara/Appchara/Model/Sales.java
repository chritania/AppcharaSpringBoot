package com.Appchara.Appchara.Model;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "sale")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_id")
    private Long id;

    @Column(name = "sales_details_id")
    private Long salesDetailsId;


    private Integer quantity;

    @CreationTimestamp
    @Column(updatable = false, name = "sale_date")
    private LocalDateTime saleDate;

    @Column(name = "total_amount")
    private double totalAmount;

    public Sales() {
    }

    public Long getId() {
        return id;
    }
    
    public Long getSalesDetailsId() {
        return salesDetailsId;
    }

    public void setSalesDetailsId(Long salesDetailsId) {
        this.salesDetailsId = salesDetailsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}