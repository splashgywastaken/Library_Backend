package ru.libraryteam.library.rest.api;

import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.db.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @GetMapping()
  Iterable<BookEntity> getBooks() {
    return bookRepository.findAll();
  }

  @PostMapping
  BookEntity createBook(@RequestBody BookEntity book) {
    return bookRepository.save(book);
  }

  @PutMapping("/{id}")
  BookEntity updateBook(@RequestBody BookEntity book, @PathVariable int id) {
    book.setId(id);
    return bookRepository.save(book);
  }

  @DeleteMapping("/{id}")
  void deleteBook(@PathVariable int id) {
    bookRepository.deleteById(id);
  }
}
