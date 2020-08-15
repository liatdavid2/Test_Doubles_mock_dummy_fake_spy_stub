package fake;

import java.time.LocalDate;

public class BookService {
	
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public int findNumberOfBooks() {
		return bookRepository.findAll().size();
	}
	
}
