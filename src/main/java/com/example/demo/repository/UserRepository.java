package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Long> {

}
