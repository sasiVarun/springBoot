package in.webmvc.sasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//	@RequestMapping(value = "/show",method = RequestMethod.GET)
	@GetMapping("/show")
	public String showHome(Model model) {
		System.out.println(model.getClass().getName());//to get implementation class name as Model is interface
		model.addAttribute("title", "NIT");
		return "Home";
	}
}
