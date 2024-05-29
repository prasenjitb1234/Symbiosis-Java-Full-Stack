package com.student.StudentManagement.services;

import java.util.List;

import com.student.StudentManagement.model.Student;

public interface StudentServices {

	public Student saveRegistered(Student student);
	
	public List<Student> studentList();
	
	public void deleteById(int id);
	
	public Student findById(int id);
	
	public Student updateStudent(Student student);
	
	
}
