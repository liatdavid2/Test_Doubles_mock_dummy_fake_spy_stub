package spy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import java.time.LocalDate;


public class SpyTest {
	@Test
	public void demoSpy() {
		//arrange
		SpyBookRepository bookRepository = new SpyBookRepository();
		BookService bookService = new BookService(bookRepository);
		//act
		Book book1 = new Book("12345","Dr. Seuss's ABC",250.5,LocalDate.now());
		Book book2 = new Book("12346","The Very Hungry Caterpillar",250.5,LocalDate.now());
		bookService.addBook(book1);
		bookService.addBook(book2);
		//assert
		assertThat(2).isEqualTo(bookRepository.timesCalled());
		assertThat(true).isEqualTo(bookRepository.calledWith(book2));
	}

}
