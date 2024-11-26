package in.uk.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	public Book() {
		
	}
	
	public Book(int i, String string, double d) {
		// TODO Auto-generated constructor stub
		this.bookId=i;
		this.bookName=string;
		this.bookPrice=d;
	}
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
}
