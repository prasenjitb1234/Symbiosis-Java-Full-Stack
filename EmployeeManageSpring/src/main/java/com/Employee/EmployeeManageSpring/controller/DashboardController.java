package com.Employee.EmployeeManageSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Employee.EmployeeManageSpring.model.Employee;
import com.Employee.EmployeeManageSpring.services.EmployeeServices;

import jakarta.validation.Valid;

@Controller
public class DashboardController {

	@Autowired
	private EmployeeServices employeeservice;
	
	@GetMapping("/employeelist")
	public String getEmployeeList(Model model) {
		List<Employee> employeeList = employeeservice.employeeList();
		model.addAttribute("employees",employeeList);
		return "employees";
	}
	
	@PostMapping("/employee/delete")
    public String getDelete(@RequestParam("id") int id, Model model) {
		employeeservice.deleteById(id);
        String deleteMessage = "Employee Successfully Deleted With Id: " + id;
        model.addAttribute("message", deleteMessage);
        List<Employee> employeeList = employeeservice.employeeList();
        model.addAttribute("employees", employeeList);
        return "employees";
    }

    @GetMapping("/employee/edit")
    public String getEdit(@RequestParam("id") int id, Model model) {
        System.out.println("check");
        Employee employee = employeeservice.findById(id);
        System.out.println(employee.getName());
        model.addAttribute("employee", employee);
       
        return "updateform";  
    }
	
    
    @PostMapping("/saveupdate")
    public String getUpdate(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindResult) {
    	if(bindResult.hasErrors()) {
    		return "updateform";
    	}
    	employeeservice.updateEmployee(employee);
		return "redirect:/employeelist";
    	
    }
	
}
