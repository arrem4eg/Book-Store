package academy.mate.bookstore.service;

import academy.mate.bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
