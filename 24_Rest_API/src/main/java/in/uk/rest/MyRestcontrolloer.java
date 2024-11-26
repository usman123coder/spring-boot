package in.uk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestcontrolloer {
 
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to RestAPI...........";
		return msg;
	}
}
