package spy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SpyBookRepository implements BookRepository {

	int saveCalled = 0;
	Book lastAddedBook = null;
	
	@Override
	public void save(Book book) {
		saveCalled++;
		lastAddedBook = book;
	}
	public int timesCalled() {
		return saveCalled;
	}
	public boolean calledWith(Book book) {
		return lastAddedBook.equals(book);
	}

}
