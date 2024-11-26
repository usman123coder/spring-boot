package in.uk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.uk.repo.BookRepository;
import in.uk.*;
import in.uk.Entity.Book;


@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(JpaProjectApplication.class, args);
		
		BookRepository repo = ctx.getBean(BookRepository.class);
		boolean b1=repo.existsById(101);
		System.out.println(b1);
		
		Book b = new Book();
		System.out.println(b.hashCode());
		
		
		System.out.println("record inserted");
		
	}

}
