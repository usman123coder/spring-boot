package in.uk;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.context.ConfigurableApplicationContext;

import in.uk.entity.Employee;
import in.uk.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				 SpringApplication.run(Application.class, args);
		
		EmployeeRepository repo = ctx.getBean(EmployeeRepository.class);
//		
//		Employee e1 = new Employee(101,"Usman","IT","Hyd",8989560070L);
//		Employee e2 = new Employee(102,"Salman","IT","Hyd",8989560070L);
//		Employee e3 = new Employee(103,"Suleman","IT","Hyd",8989560070L);
//		Employee e4 = new Employee(104,"Ubesh","IT","Hyd",8989560070L);
//		Employee e5 = new Employee(105,"Mudassir","IT","Hyd",8989560070L);
//		Employee e6 = new Employee(106,"Shahzad","IT","Hyd",8989560070L);
//		
//		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
//		
//		System.out.println("Record Inserted successfully....");
		
		org.springframework.data.domain.Sort sort = org.springframework.data.domain.Sort.by("empName").ascending();
		
		List<Employee> emps = repo.findAll(sort);
		
		emps.forEach(System.out::println);
		
	}

}
