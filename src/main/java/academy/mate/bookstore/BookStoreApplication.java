package academy.mate.bookstore;

import academy.mate.bookstore.model.Book;
import academy.mate.bookstore.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreApplication {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Book book1984 = new Book();
			book1984.setTitle("1984");
			book1984.setAuthor("George Orwell");
			book1984.setIsbn("2-266-11156-7");
			book1984.setPrice(BigDecimal.valueOf(100));
			bookService.save(book1984);
			System.out.println(bookService.findAll());
		};
	}
}
