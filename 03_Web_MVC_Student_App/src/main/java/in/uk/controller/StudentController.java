package in.uk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.uk.binding.Student1;
import in.uk.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student1());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());
	}
	
	@PostMapping("/save")
	public String saveStudent(Student1 s, Model model) {
		System.out.println(s);
init(model);
		model.addAttribute("msg", "Data saved....");
		return "index";
	}
}
