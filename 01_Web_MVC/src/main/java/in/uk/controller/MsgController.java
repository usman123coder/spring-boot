package in.uk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to Islam.....");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreeting() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Assalamu Alaikum");
		mav.setViewName("message");
		return mav;
	}
}
