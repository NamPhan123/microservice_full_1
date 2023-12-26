package com.example.departmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.DepartmentEntity;
import com.example.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<DepartmentEntity> findAll() {
		return departmentRepository.findAll();
	}
	
	public DepartmentEntity findById(Long id) {
		return departmentRepository.findById(id).get();
	}
	
	public DepartmentEntity save(DepartmentEntity departmentEntity) {
		return departmentRepository.save(departmentEntity);
	}

}
