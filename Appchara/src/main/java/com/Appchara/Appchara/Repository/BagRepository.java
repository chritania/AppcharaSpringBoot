package com.Appchara.Appchara.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.Bag;

public interface BagRepository extends JpaRepository<Bag, Long> {
    List<Bag> findAllByUserId(Long id);

}
