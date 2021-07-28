package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.model.BookDtoImpl;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookService service;

  @Autowired
  public BookController(BookService service) {
    this.service = service;
  }

  @GetMapping
  PageDto<BookDto> findBooks(
    @RequestParam(name = "search", required = false) String search,
    @RequestParam(name = "page_size", defaultValue = "10") Integer pageSize,
    @RequestParam(name = "page_number", defaultValue = "0") Integer pageNumber
  ) {
    return service.find(search, pageSize, pageNumber);
  }

  /*@GetMapping()
  List<BookDto> getBooks() {
    return service.findAll();
  }*/

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  BookDto createBook(@RequestBody BookDto book) {
    return service.createBook(book);
  }

  @PutMapping("/{id}")
  BookDto updateBook(@RequestBody BookDtoImpl book, @PathVariable int id) {
    book.setId(id);
    return service.updateBook(book);
  }

  @DeleteMapping("/{id}")
  void deleteBook(@PathVariable int id) {
    service.deleteBook(id);
  }
}
