package com.employee.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@Column(name = "empid", nullable = false)
	private String empId;
	@Column(name = "empname", nullable = false)
	private String empName;
	@Column(name = "empemail", nullable = false)
	private String empEmail;
	@Column(name = "empmobile", nullable = false)
	private String empMobile;
	@Column(name = "empsalary", nullable = false)
	private double empSalary;
	@Column(name = "empage", nullable = false)
	private int age;
	@Column(name = "empdept", nullable = false)
	private String empDept;
}
