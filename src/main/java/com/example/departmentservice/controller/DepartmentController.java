package com.example.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.IDepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private IDepartmentService iDepartmentService;
	
	@PostMapping
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department)
	{
		return new ResponseEntity<Department>(iDepartmentService.saveDepartment(department), HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Department> getDepartment(@PathVariable("id") Integer id)
	{
		return new ResponseEntity<Department>(iDepartmentService.getDepartment(id), HttpStatus.OK);
	}

}

