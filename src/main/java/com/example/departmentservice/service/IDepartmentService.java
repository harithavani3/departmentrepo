package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;

public interface IDepartmentService {

	Department saveDepartment(Department department);
	Department getDepartment(Integer departmentId);
	
}
