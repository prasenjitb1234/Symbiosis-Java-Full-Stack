package com.student.StudentManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.StudentManagement.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
