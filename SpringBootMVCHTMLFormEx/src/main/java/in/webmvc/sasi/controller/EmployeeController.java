package in.webmvc.sasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.webmvc.sasi.entity.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}
	
	@PostMapping("/save")
	public String readForm(
			@ModelAttribute Employee employee, //read data from Form
			Model model // send data to UI
			) {
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "EmpData";
	}
}
