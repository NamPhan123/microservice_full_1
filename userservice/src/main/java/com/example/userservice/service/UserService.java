package com.example.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.userservice.entity.UserEntity;
import com.example.userservice.model.DepartmentModel;
import com.example.userservice.model.ReponseModel;
import com.example.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UserEntity save(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}
	
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}
	
	public UserEntity findById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public ReponseModel getUserWithDepartment(Long id) {
		ReponseModel result = new ReponseModel();
		UserEntity user = userRepository.findById(id).get();
		DepartmentModel department = 
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
						DepartmentModel.class);
		result.setUserEntity(user);
		result.setDepartmentModel(department);
		return result;
	}

}
