package com.Task.TaskManagerApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.TaskManagerApplication.dao.AdminRepo;
import com.Task.TaskManagerApplication.model.Admin;


@Service
public class AdminServicesImp implements AdminServices{
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin saveRegistered(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> adminList() {
		List<Admin> findAll=adminRepo.findAll();
		return findAll;
	}

}
