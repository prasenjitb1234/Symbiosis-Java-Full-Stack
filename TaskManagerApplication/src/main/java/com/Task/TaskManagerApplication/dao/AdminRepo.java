package com.Task.TaskManagerApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Task.TaskManagerApplication.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>{

}
