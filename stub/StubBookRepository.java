package stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StubBookRepository implements BookRepository {

	@Override
	public List<Book> findNewBooks(int days) {
		List<Book> newBooks = new ArrayList<>();
		newBooks.add(new Book("12345","Dr. Seuss's ABC",500,LocalDate.now()));
		newBooks.add(new Book("12346","The Very Hungry Caterpillar",400,LocalDate.now()));
		return newBooks;
	}

}
