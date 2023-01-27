package com.employee.app.service.impl;

import java.util.List;
import java.util.Optional;

import com.employee.app.respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.model.Employee;
import com.employee.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRespository employeeRespository;

	@Override
	public Optional<Employee> getEmployee(String id) {
		return employeeRespository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {		 
		return employeeRespository.findAll();
	}

}
