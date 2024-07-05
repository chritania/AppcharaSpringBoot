package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
