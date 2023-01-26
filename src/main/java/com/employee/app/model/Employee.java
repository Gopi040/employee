package com.employee.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String empId;
	private String empName;
	private String empEmail;
	private String empMobile;
	private double empSalary;
	private int age;
	private String empDept;
	
}
