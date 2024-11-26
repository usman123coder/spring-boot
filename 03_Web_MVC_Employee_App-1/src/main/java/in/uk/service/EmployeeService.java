package in.uk.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public List<String> getDesignation(){
		return Arrays.asList("Developer","DeveOps","Tester","TL","Scrum Master","Manager");
	}
	
	public List<String> getLocation(){
		return Arrays.asList("Hyd","Bengalore","Chennai","Pune","Noida");
	}
}
