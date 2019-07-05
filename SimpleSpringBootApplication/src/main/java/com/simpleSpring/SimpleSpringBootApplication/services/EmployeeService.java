package com.simpleSpring.SimpleSpringBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.simpleSpring.SimpleSpringBootApplication.entities.Employee;
import com.simpleSpring.SimpleSpringBootApplication.repo.EmployeeDAO;

@Service
public class EmployeeService implements EmployeeDAO{
	
	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void addEmployee(final Employee employee) {
		employees.add(employee);
		
	}

	@Override
	public Employee findEmployee(final Integer id) {
		return employees.stream().filter(emp ->emp.getId().intValue() ==id.intValue()).findFirst().get();
		
	}

}
