package in.uk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uk.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
