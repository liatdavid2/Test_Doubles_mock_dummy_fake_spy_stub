package stub;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import java.time.LocalDate;
import java.util.List;


public class StubTest {
	@Test
	public void demoStub() {
		//arrange
		StubBookRepository bookRepository = new StubBookRepository();
		BookService bookService = new BookService(bookRepository);
		//act
		List<Book> newBooksWithAppliedDiscount =  bookService.getNewBooksWithAppliedDiscount(10, 7);
		//assert
		assertThat(2).isEqualTo(newBooksWithAppliedDiscount.size());
		assertThat(450.0).isEqualTo(newBooksWithAppliedDiscount.get(0).getPrice());
		assertThat(360.0).isEqualTo(newBooksWithAppliedDiscount.get(1).getPrice());
	}

}
