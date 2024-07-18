package com.Appchara.Appchara.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
    Optional<UserDetails> findByPhoneNumber(String phoneNumber);
}


