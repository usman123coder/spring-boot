package in.uk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	private Integer bookId;
	private String bookNm;
	private Double price;
}
