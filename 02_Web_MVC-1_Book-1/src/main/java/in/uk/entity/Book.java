package in.uk.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private Integer id;
	private String bookName;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookName, id, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	 
}
