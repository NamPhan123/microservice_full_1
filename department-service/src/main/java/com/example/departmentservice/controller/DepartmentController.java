package com.example.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.entity.DepartmentEntity;
import com.example.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public DepartmentEntity create(@RequestBody DepartmentEntity departmentEntity) {
		return departmentService.save(departmentEntity);
	}
	
	@GetMapping
	public List<DepartmentEntity> findAll() {
		return departmentService.findAll();
	}
	
	@GetMapping("/{id}")
	public DepartmentEntity findById(@PathVariable Long id) {
		return departmentService.findById(id);
	}

}
