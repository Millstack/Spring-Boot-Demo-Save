package com.jsp.SpringBootProject2Save.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootProject2Save.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}