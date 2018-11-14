package com.bliztech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bliztech.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
