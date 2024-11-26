package in.uk.controller;

//import java.awt.print.Book;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.uk.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println("Id :: "+id);
//		Optional<Book> findById = repo.findById(id);
		Optional<in.uk.entity.Book> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			in.uk.entity.Book bookObj = findById.get();
			System.out.println(bookObj);
			mav.addObject("book",bookObj);
		}
		
		mav.setViewName("index");
		
		return mav;
		
	}
}
