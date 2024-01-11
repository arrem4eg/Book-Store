package academy.mate.bookstore.mapper;

import academy.mate.bookstore.config.MapperConfig;
import academy.mate.bookstore.dto.BookDto;
import academy.mate.bookstore.dto.CreateBookRequestDto;
import academy.mate.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
