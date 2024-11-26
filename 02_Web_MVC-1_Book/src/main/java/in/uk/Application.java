package in.uk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.uk.entity.Book;
import in.uk.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
		SpringApplication.run(Application.class, args);
		
//		BookRepository book = ctx.getBean(BookRepository.class);
//		Book b = new Book();
//		b.setId(103);
//		b.setBookName("Oracle");
//		b.setPrice(420.22);
//		book.save(b);
//		System.out.println("Record entered successfully....");
	}

}
