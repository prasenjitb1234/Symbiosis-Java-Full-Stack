package com.Task.TaskManagerApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Task.TaskManagerApplication.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{

}
