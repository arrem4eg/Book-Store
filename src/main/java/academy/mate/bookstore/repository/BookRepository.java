package academy.mate.bookstore.repository;

import academy.mate.bookstore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
