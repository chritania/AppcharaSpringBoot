package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

}
