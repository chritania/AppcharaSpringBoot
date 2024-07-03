package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
