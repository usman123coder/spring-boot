package in.uk.beans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() {
		System.out.println("Car Constructor");
	}
}
