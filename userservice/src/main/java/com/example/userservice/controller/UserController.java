package com.example.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.entity.UserEntity;
import com.example.userservice.model.ReponseModel;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public UserEntity create(@RequestBody UserEntity userEntity) {
		return userService.save(userEntity);
	}
	
	@GetMapping
	public List<UserEntity> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public UserEntity findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/department/{id}")
	public ReponseModel getUserWithDepartment(@PathVariable Long id) {
		return userService.getUserWithDepartment(id);
	}
	
}
