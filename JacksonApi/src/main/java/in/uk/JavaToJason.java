package in.uk;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJason {
	
	public static void main(String[] args) throws Exception{
		
		Address a = new Address();
		
		a.setCity("bhopal");
		a.setCountry("India");
		a.setState("MP");
		
		
		Customer c = new Customer();
		
		c.setContNo(101);
		c.setCusName("Usman");
		c.setContNo(888888888);
		c.setAdd(a);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("json file created");
	}

}
