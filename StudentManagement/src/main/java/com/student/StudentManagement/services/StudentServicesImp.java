package com.student.StudentManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentManagement.dao.StudentRepo;
import com.student.StudentManagement.model.Student;

@Service
public class StudentServicesImp implements StudentServices {

	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public Student saveRegistered(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}


	@Override
	public List<Student> studentList() {
		List<Student> findAll = studentRepo.findAll();
		return findAll;
	}


	@Override
	public void deleteById(int id) {
		studentRepo.deleteById(id);
		
	}


	@Override
	public Student findById(int id) {
		Optional<Student> findById  = studentRepo.findById(id);
		Student student = findById.get();
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}


	

	
	
}
