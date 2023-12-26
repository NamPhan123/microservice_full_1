package com.example.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departmentservice.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}
