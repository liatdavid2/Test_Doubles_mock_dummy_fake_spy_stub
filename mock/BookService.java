package mock;

import java.time.LocalDate;

public class BookService {
	
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book book) {
		if(book.getPrice() > 400) {
			return;
		}
		bookRepository.save(book);
	}
	
	
}
