package in.uk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Book {
	@Id
	private Integer bookId;
	private String bookNm;
	private double price;
}
