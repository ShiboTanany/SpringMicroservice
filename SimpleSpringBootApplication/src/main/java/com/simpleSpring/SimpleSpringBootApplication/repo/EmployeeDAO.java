package com.simpleSpring.SimpleSpringBootApplication.repo;

import com.simpleSpring.SimpleSpringBootApplication.entities.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);

	public Employee findEmployee(Integer id);
}
