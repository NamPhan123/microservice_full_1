package com.example.userservice.model;

import com.example.userservice.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReponseModel {
	private UserEntity userEntity;
	private DepartmentModel departmentModel;
}
