package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
//	@RequestMapping(value="/show", method=RequestMethod.GET)
	@GetMapping("/show")
	public String getHome() {		
		return "Home";
	}
	
	@GetMapping("/model")
	public String getModel(Model model) throws NoSuchMethodException, SecurityException {
		System.out.println(model.getClass().getName());
		model.addAttribute("title","Sasi");
		return "Model";
	}

}
