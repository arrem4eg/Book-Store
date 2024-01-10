package academy.mate.bookstore.service;

import academy.mate.bookstore.dto.BookDto;
import academy.mate.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto getById(Long id);
}
