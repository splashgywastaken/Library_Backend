package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.BookDto;
import ru.libraryteam.library.service.mapper.logic.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookService service;

  @Autowired
  public BookController(BookService service) {
    this.service = service;
  }

  @GetMapping()
  Iterable<BookDto> getBooks() {
    return service.findAll();
  }

  @PostMapping
  BookDto createBook(@RequestBody BookDto book) {
    return service.createBook(book);
  }

  @PutMapping("/{id}")
  BookDto updateBook(@RequestBody BookDto book, @PathVariable int id) {
    book.setId(id);
    return service.updateBook(book);
  }

  @DeleteMapping("/{id}")
  void deleteBook(@PathVariable int id) {
    service.deleteBook(id);
  }
}
