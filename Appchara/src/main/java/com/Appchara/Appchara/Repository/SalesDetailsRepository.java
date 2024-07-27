package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Appchara.Appchara.Model.SalesDetails;

@Repository
public interface SalesDetailsRepository extends JpaRepository <SalesDetails, Long> {

}
