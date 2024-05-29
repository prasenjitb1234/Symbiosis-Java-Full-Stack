package com.Employee.EmployeeManageSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.EmployeeManageSpring.dao.EmployeeRepo;
import com.Employee.EmployeeManageSpring.model.Employee;


@Service
public class EmployeeServicesImp implements EmployeeServices{
	@Autowired
	private EmployeeRepo  employeeRepo;
	
	@Override
	public Employee saveRegistered(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> employeeList() {
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> findById  = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

}
