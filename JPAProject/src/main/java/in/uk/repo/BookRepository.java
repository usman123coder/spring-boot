package in.uk.repo;

import org.springframework.data.repository.CrudRepository;

import in.uk.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
