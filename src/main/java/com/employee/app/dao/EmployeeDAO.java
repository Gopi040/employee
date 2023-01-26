package com.employee.app.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employee.app.model.Employee;

@Component
public class EmployeeDAO {
	
	public List<Employee> employeesList(){
		List<Employee> empList = Arrays.asList( 
				new Employee("Emp1234", "abcd",
		  "abcd.xyz-123@tcs.com", "987456321", 20000.89, 20, "IT"), 
				new Employee("Emp123", "khhkh", "khhkh.xyz-123@tcs.com", "989456321", 10000.89,
		  25, "NON-IT"), 
				new Employee("Emp569", "yuui", "yuui.xyz-123@tcs.com",
		  "989756321", 50000.00, 30, "IT"));
		return empList;		
	}
}
