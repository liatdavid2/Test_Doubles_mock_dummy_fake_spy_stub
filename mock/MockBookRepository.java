package mock;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MockBookRepository implements BookRepository {

	int saveCalled = 0;
	Book lastAddedBook = null;
	
	@Override
	public void save(Book book) {
		saveCalled++;
		lastAddedBook = book;
	}
	public void verify(Book book,int times) {
		assertThat(times).isEqualTo(saveCalled);
		assertThat(book).isEqualTo(lastAddedBook);
	}


}
