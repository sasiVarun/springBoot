package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@GetMapping("/details")
	public String show(
//			@RequestParam("ename") String name,
			@RequestParam(value="ename", required=false) String name,
			@RequestParam("esal") Double sal,
			Model model
			) 
	{
		System.out.println("ename:" + name);
		System.out.println("esal:" + sal);
		
		model.addAttribute("ename", name);
		model.addAttribute("esal", sal);
		return "EmpData";
	}
}
