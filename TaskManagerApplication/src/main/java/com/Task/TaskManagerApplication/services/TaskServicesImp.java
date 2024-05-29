package com.Task.TaskManagerApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Task.TaskManagerApplication.dao.TaskRepository;
import com.Task.TaskManagerApplication.model.Task;



@Service
public class TaskServicesImp implements TaskServices{

	
	@Autowired
	private TaskRepository taskRepo;

	@Override
	public Task saveRegistered(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public List<Task> taskList() {
		List<Task> findAll = taskRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		taskRepo.deleteById(id);
		
	}

	@Override
	public Task findById(int id) {
		Optional<Task> findById  = taskRepo.findById(id);
		Task task = findById.get();
		return task;
	}

	@Override
	public Task updateEmployee(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}
	
	
	
	
	
	
	
}
