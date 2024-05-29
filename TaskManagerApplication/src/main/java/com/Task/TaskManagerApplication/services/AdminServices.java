package com.Task.TaskManagerApplication.services;

import java.util.List;

import com.Task.TaskManagerApplication.model.Admin;

public interface AdminServices {

	public Admin saveRegistered(Admin admin);

	public List<Admin> adminList();

}
