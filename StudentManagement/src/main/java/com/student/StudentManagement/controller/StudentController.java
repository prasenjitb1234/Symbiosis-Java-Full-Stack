package com.student.StudentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.StudentManagement.model.Student;
import com.student.StudentManagement.services.StudentServices;

import jakarta.validation.Valid;

@Controller
@Transactional
public class StudentController {
	
	@Autowired
	private StudentServices studentservice;
	
	
	@GetMapping("/registerStudent")
	public String regiStud(Model model) {
		model.addAttribute("student", new Student());
		return "studentregistration";
	}
	
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("student") Student student, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "studentregistration";
		}
		studentservice.saveRegistered(student);
		return "redirect:/studentlogin";
	}
	
	
	
	
}
