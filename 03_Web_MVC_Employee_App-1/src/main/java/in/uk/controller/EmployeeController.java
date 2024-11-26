package in.uk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.uk.binding.Employee;
import in.uk.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		model.addAttribute("emp", new Employee());
		model.addAttribute("desig",service.getDesignation());
		model.addAttribute("loc",service.getLocation());
		
		return "index";
	}
	
	public String handleFormSubmit(Employee e, Model model) {
		System.out.println(e);
		model.addAttribute("emp", new Employee());
		model.addAttribute("desig",service.getDesignation());
		model.addAttribute("loc",service.getLocation());
		model.addAttribute("msg","Data Saved.....");
		return "index";
	}
}
