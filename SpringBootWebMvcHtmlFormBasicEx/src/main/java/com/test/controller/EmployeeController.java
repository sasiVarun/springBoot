package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.entity.Employee;

@Controller
public class EmployeeController {
	
	//1. Show Register page
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}
	
	//2. Read form data
	@PostMapping("/save")
	public String readForm(
			@ModelAttribute Employee employee, // read Form
			Model model // send to UI
			) 
	{
		System.out.println(employee);
		model.addAttribute("employee", employee);		
		return "EmpData";
	}
	
}
