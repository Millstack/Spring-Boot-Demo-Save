package com.jsp.SpringBootProject2Save.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootProject2Save.dto.ResponseStructure;
import com.jsp.SpringBootProject2Save.dto.User;
import com.jsp.SpringBootProject2Save.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public ResponseStructure<User> saveUSer(@RequestBody User user){
		return userService.saveUser(user);
	}
}