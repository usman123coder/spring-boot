package in.uk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.uk.beans.Car;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		Car c = ctx.getBean(Car.class);
		System.out.println(c.hashCode());
	}
	
	@GetMapping("/")
	public String welcome() {
//		System.out.println("Welcome Welcome......You are our guest");
		return "Welcome Welcome......You are our guest";
	}

}
