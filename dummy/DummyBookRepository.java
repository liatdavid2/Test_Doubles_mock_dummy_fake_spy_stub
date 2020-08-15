package dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DummyBookRepository implements BookRepository {

	// in memory db, hashmap or list
	Map<String,Book> bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);		
	}

	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

}
