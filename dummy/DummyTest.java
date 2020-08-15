package dummy;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import java.time.LocalDate;


public class DummyTest {
	@Test
	public void demoDummy() {
		//arrange
		DummyBookRepository dummyBookRepository = new DummyBookRepository();
		DummyEmailService dummyEmailService = new DummyEmailService();
		BookService bookService = new BookService(dummyBookRepository,dummyEmailService);
		//act
		bookService.addBook(new Book("12345","Dr. Seuss's ABC",250.5,LocalDate.now()));
		bookService.addBook(new Book("12346","The Very Hungry Caterpillar",250.5,LocalDate.now()));
		//assert
		assertThat(2).isEqualTo(bookService.findNumberOfBooks());
	}

}
