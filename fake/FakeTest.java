package fake;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import java.time.LocalDate;


public class FakeTest {
	@Test
	public void fakeTest() {
		//arrange
		FakeBookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		//act
		bookService.addBook(new Book("12345","Dr. Seuss's ABC",250.5,LocalDate.now()));
		bookService.addBook(new Book("12346","The Very Hungry Caterpillar",250.5,LocalDate.now()));
		//assert
		assertThat(2).isEqualTo(bookService.findNumberOfBooks());
	}

}
