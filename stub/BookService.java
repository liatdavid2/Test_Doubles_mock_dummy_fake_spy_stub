package stub;

import java.time.LocalDate;
import java.util.List;

public class BookService {
	
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getNewBooksWithAppliedDiscount(int discountRate,int days){
		List<Book> newBooks = bookRepository.findNewBooks(days);
		for(Book book:newBooks) {
			double price = book.getPrice();
			double newPrice = price - (discountRate * price /100);
			book.setPrice(newPrice);
		}
		return newBooks;
	}
	
}
