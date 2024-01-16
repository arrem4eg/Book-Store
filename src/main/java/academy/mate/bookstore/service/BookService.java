package academy.mate.bookstore.service;

import academy.mate.bookstore.dto.BookDto;
import academy.mate.bookstore.dto.CreateBookRequestDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll(Pageable pageable);

    BookDto getById(Long id);

    BookDto updateById(Long id, CreateBookRequestDto requestDto);

    void deleteById(Long id);
}
