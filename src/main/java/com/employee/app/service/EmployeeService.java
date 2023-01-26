package com.employee.app.service;

import java.util.List;

import com.employee.app.model.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(String id);
	
	public List<Employee> getAllEmployees();

}
