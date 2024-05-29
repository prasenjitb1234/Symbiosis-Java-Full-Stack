package com.Task.TaskManagerApplication.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Task.TaskManagerApplication.model.Task;
import com.Task.TaskManagerApplication.services.TaskServices;

import jakarta.validation.Valid;



@Controller
@Transactional
public class TaskController {

	

    @Autowired
    private TaskServices taskService;

    @GetMapping("/registerTask")
    public String showTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "taskForm";
    }

    @PostMapping("/registerTask")
    public String registerTask(@Valid @ModelAttribute("task") Task task, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "taskform";
        }
        taskService.saveRegistered(task);
        return "redirect:/tasklist"; 
    }

    @GetMapping("/tasklist")
    public String showTaskList(Model model) {
        
        List<Task> taskList = taskService.taskList();
        model.addAttribute("taskList", taskList);
        return "tasklist"; 
    }
   
	
	
}
