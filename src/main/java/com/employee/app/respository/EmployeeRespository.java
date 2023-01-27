package com.employee.app.respository;

import com.employee.app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRespository extends JpaRepository<Employee, String> {
}
