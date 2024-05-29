package com.Employee.EmployeeManageSpring.services;

import java.util.List;

import com.Employee.EmployeeManageSpring.model.Employee;


public interface EmployeeServices {

	public Employee saveRegistered(Employee employee);
	
	public List<Employee> employeeList();
	
	public void deleteById(int id);
	
	public Employee findById(int id);
	
	public Employee updateEmployee(Employee employee);
}
