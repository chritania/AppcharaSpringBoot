package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
