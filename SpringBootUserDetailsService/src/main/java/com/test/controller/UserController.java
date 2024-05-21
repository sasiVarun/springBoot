package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.model.User;
import com.test.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService service;

	@GetMapping("/reg")
	public String showReg() {
		return "UserRegister";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model) {
		Integer id = service.saveUser(user);
		String msg = "User'" + id + "' is saved";
		model.addAttribute("message", msg);
		return "UserRegister";
	}
}
