package com.Task.TaskManagerApplication.services;

import java.util.List;


import com.Task.TaskManagerApplication.model.Task;

public interface TaskServices {

	public Task saveRegistered(Task task);

	public List<Task> taskList();

	public void deleteById(int id);

	public Task findById(int id);

	public Task updateEmployee(Task task);

}
