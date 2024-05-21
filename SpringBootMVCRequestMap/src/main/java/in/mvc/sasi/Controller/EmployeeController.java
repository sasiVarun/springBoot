package in.mvc.sasi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@GetMapping("/details")
	public String showData(
			@RequestParam(value="ename", required = false) String ename,
			@RequestParam("esal") Double esal,
			Model model
			) 
	{
		System.out.println("data is "+ename +", "+ esal);
		model.addAttribute("empname", ename);
		model.addAttribute("empsal", esal);
		return "EmpData";
	}
	
	@GetMapping("/delete")
	public String delete() {
		System.out.println("Delete methid is called");
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showAll() {
		System.out.println("Show all method is called");
		return "Sample";
	}
}
