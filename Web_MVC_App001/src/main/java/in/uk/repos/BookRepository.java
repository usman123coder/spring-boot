package in.uk.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uk.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
