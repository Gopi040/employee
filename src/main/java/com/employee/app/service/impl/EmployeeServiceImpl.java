package com.employee.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.dao.EmployeeDAO;
import com.employee.app.model.Employee;
import com.employee.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee getEmployee(String id) {
		Employee emp = new Employee();	
		for(Employee e : employeeDAO.employeesList()) {
			if(e.getEmpId().equals(id)) {
				emp = e;
			}
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {		 
		return employeeDAO.employeesList();
	}

}
