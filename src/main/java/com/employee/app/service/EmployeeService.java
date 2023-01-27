package com.employee.app.service;

import java.util.List;
import java.util.Optional;

import com.employee.app.model.Employee;

public interface EmployeeService {
	
	public Optional<Employee> getEmployee(String id);
	
	public List<Employee> getAllEmployees();

}
