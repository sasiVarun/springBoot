package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/welcome")
	public String showWelcome() {
		return "WelcomePage";
	}
	
	@GetMapping("/home")
	public String showHome() {
		return "HomePage";
	}
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "AdminPage";
	}
	
	@GetMapping("/emp")
	public String showEmployee() {
		return "EmpPage";
	}
	
	@GetMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
	
}
