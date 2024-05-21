package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //@Component + HTTP Protocol
public class HomeController {
	
//	@RequestMapping(value="/show",method = RequestMethod.GET)
	@GetMapping("/show")
	public String showHome(Model model) {
		System.out.println(model.getClass().getName());
		
		//Key(String,Object)
		model.addAttribute("title", "Google");
		return "Home";
	}
}
