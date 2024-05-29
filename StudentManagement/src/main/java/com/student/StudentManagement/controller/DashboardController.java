package com.student.StudentManagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.StudentManagement.model.Student;
import com.student.StudentManagement.services.StudentServices;


import jakarta.validation.Valid;

@Controller
public class DashboardController {

	@Autowired
	private StudentServices studentservice;
	
	@GetMapping("/studentlist")
	public String getStudentList(Model model) {
		List<Student> studentList = studentservice.studentList();
		model.addAttribute("students",studentList);
		return "students";
	}
	
	@PostMapping("/student/delete")
    public String getDelete(@RequestParam("id") int id, Model model) {
		studentservice.deleteById(id);
        String deleteMessage = "Student Successfully Deleted With Id: " + id;
        model.addAttribute("message", deleteMessage);
        List<Student> studentList = studentservice.studentList();
        model.addAttribute("students", studentList);
        return "students";
    }

    @GetMapping("/student/edit")
    public String getEdit(@RequestParam("id") int id, Model model) {
        System.out.println("check");
        Student student = studentservice.findById(id);
        System.out.println(student.getName());
        model.addAttribute("student", student);
       
        return "updateform";  
    }
	
    
    @PostMapping("/saveupdate")
    public String getUpdate(@Valid @ModelAttribute("student") Student student,BindingResult bindResult) {
    	if(bindResult.hasErrors()) {
    		return "updateform";
    	}
    	studentservice.updateStudent(student);
		return "redirect:/studentlist";
    	
    }
	
}
