package com.jsp.SpringBootProject2Save.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootProject2Save.dto.User;
import com.jsp.SpringBootProject2Save.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;
	
	public User SaveUser(User user) {
		return userRepository.save(user);
	}
}