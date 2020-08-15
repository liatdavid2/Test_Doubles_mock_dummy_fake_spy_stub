package spy;

import java.time.LocalDate;

public class Book {
	private String bookId;
	private String title;
	private double price;
	private LocalDate publishedDate;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookId, String title, double price, LocalDate publishedDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.publishedDate = publishedDate;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
}
