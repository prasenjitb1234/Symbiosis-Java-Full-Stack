package com.Employee.EmployeeManageSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Employee.EmployeeManageSpring.model.Employee;
import com.Employee.EmployeeManageSpring.services.EmployeeServices;


import jakarta.validation.Valid;



@Controller
@Transactional
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeservice;
	
	
	@GetMapping("/registerEmployee")
	public String regiEmp(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeregistration";
	}
	
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "employeeregistration";
		}
		employeeservice.saveRegistered(employee);
		return "redirect:/employeelogin";
	}
	
}
