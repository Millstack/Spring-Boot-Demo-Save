package com.jsp.SpringBootProject2Save.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.SpringBootProject2Save.dao.UserDao;
import com.jsp.SpringBootProject2Save.dto.ResponseStructure;
import com.jsp.SpringBootProject2Save.dto.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public ResponseStructure<User> saveUser(User user){
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setData(userDao.SaveUser(user));
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("User saved successfuly");
		return responseStructure;
	}
}