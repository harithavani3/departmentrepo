package com.example.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	private DepartmentRepository departmentRepository;
	
	@Autowired
	DepartmentServiceImpl(DepartmentRepository departmentRepository)
	{
		this.departmentRepository= departmentRepository;
	}
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartment(Integer departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).orElse(null);
	}

	
	
}
