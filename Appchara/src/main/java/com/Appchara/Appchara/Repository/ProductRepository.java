package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductId(Long id);
}
