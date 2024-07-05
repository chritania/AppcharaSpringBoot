package com.Appchara.Appchara.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Appchara.Appchara.Model.UserDerails;

public interface UserDetailsRepository extends JpaRepository<UserDerails, Long> {

}
