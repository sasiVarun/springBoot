package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.entity.Employee;
import com.test.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	// 1. Show Register Page
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}
	
	// 2. Read Form Data
	@PostMapping("/save")
	public String save(
			@ModelAttribute Employee employee,
			Model model
			) 
	{
		Integer id = service.saveEmployee(employee);
		
		String msg = "Employee '"+ id +"' Created";
		model.addAttribute("message", msg);
		
		return "EmployeeRegister";
	}
	
	// 3. Display all rows
	@GetMapping("/all")
	public String getAll(
				Model model,
				@RequestParam(required=false) String message
			) 
	{
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		return "EmployeeData";
	}
	
	// 4. Delete row by id and redirect to all 
	@GetMapping("/delete")
	public String delete(
				@RequestParam Integer id,
				RedirectAttributes attributes
			) 
	{
		service.deleteEmployee(id);
		attributes.addAttribute("message", "Employee '"+ id+"' deleted");
		return "redirect:all";
	}
	
	// 5. Show data in edit page
	@GetMapping("/edit")
	public String edit(
			@RequestParam Integer id,
			Model model
			) 
	{
		Employee emp = service.getOneEmployee(id);
		model.addAttribute("employee", emp);
		return "EmployeeEdit";
	}
	
	// 6. On click update set data to DB and redirect to all 
	@PostMapping("/update")
	public String update(
			@ModelAttribute Employee emp,
			RedirectAttributes attributes
			) 
	{
		service.updateEmployee(emp);
		String message = "Employee '"+ emp.getEmpId()+"' Updated";
		attributes.addAttribute("message", message);
		return "redirect:all";
	}

}
