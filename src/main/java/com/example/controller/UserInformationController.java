package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.UserInformtionDao;
import com.example.model.UserInformation;

@RestController
@RequestMapping("/api")
public class UserInformationController {
	
	@Autowired
	private UserInformtionDao userInformtionDao;
	
	@GetMapping("/hellow")
	public String hellow() {
		return "Hello";
	}
	
	@GetMapping("/findAll")
	public List<UserInformation> getAllUserInformation(){
		return userInformtionDao.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<UserInformation> saveUser(@RequestBody UserInformation userInformation) {
		UserInformation user = userInformtionDao.save(userInformation);
		return new ResponseEntity<>(user , HttpStatus.CREATED);
		
	}

}
