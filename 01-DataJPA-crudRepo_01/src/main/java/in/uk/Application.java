package in.uk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.uk.entity.Book;
import in.uk.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(Application.class, args);
		BookRepository repo = ctx.getBean(BookRepository.class);
		System.out.println(repo.getClass().getName());
		
		Book b = new Book(102,"MS",455.00);
		
		repo.save(b);
		
		System.out.println("Record Inserted");
		
		
	}

}
