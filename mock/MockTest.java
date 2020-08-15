package mock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import java.time.LocalDate;


public class MockTest {
	@Test
	public void demoMock() {
		//arrange
		MockBookRepository bookRepository = new MockBookRepository();
		BookService bookService = new BookService(bookRepository);
		//act
		Book book1 = new Book("12345","Dr. Seuss's ABC",500,LocalDate.now());
		Book book2 = new Book("12346","The Very Hungry Caterpillar",400,LocalDate.now());
		bookService.addBook(book1); // return -> 500 > 400
		bookService.addBook(book2); // save will be called -> not 400 > 400
		//assert
		
		//last book is book2 and save called 1 time -> cous 500 > 400 and dont enter
		bookRepository.verify(book2, 1); //all assert in the mock
	}

}
