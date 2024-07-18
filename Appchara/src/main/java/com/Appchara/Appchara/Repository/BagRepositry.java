package com.Appchara.Appchara.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.Bag;

public interface BagRepositry extends JpaRepository<Bag, Long> {
    List<Bag> findByUserId(Long id);

}
