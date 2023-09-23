package br.com.devth.todolist.controllers;

import java.util.List;
import java.util.Optional;

import br.com.devth.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.devth.todolist.model.Task;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/create")
	public ModelAndView create(){
		ModelAndView mv = new ModelAndView("create");
		mv.addObject("task", new Task());
		return mv;
	}

	@GetMapping("/tasks")
	public ModelAndView read(){
		ModelAndView mv = new ModelAndView("read");
		mv.addObject("tasks", taskService.findAll());
		return mv;
	}

	@PostMapping("/create")
	public String create(Task task){
		if(task.getId() != null){
			task = taskService.updateTask(task.getId(), task);
		}else{
			task = taskService.saveTask(task);
		}
		return "redirect:/tasks";
	}

	@GetMapping(value="/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id){
		ModelAndView mv = new ModelAndView("create");
		Task task = taskService.findById(id).orElseThrow();
		mv.addObject("task", task);
		return mv;
	}

	@GetMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable("id") Long id){
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}

}
