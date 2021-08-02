package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.impl.BookDtoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/books")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping(value = "/search-book")
  PageDto<BookDto> newFindBooks(
    @RequestParam(name = "name", required = false, defaultValue = "") String bookName,
    @RequestParam(name = "author", required = false) List<String> authors,
    @RequestParam(name = "year", required = false, defaultValue = "0") Integer yearOfPublishing,
    @RequestParam(name = "tag", required = false) List<String> tags,
    @RequestParam(name = "isbn", required = false, defaultValue = "null") String isbn,
    @RequestParam(name = "genre", required = false) List<String> genres,
    @RequestParam(name = "age", required = false, defaultValue = "null") String age,
    @RequestParam(name = "page_size", defaultValue = "3") Integer pageSize,
    @RequestParam(name = "page_number", defaultValue = "0") Integer pageNumber
  ) {
    List<String> lastName = new ArrayList<>();
    List<String> firstName = new ArrayList<>();

    if (authors.isEmpty())
      authors.add("");
    else {
      for (String author: authors) {
        String[] fullName = author.split("\\s");
        if (fullName.length == 1) {
          lastName.add(fullName[0]);
          firstName.add("");
        }
        if (fullName.length > 1){
          lastName.add(fullName[0]);
          firstName.add(fullName[1]);
        }
      }
    }

    if (genres.isEmpty()) genres = new ArrayList<>();
    if (tags.isEmpty()) tags = new ArrayList<>();
    if (bookName.isEmpty() || bookName.isBlank()) bookName = UUID.randomUUID().toString();

    return bookService.newFind(
      lastName,
      firstName,
      genres,
      tags,
      bookName,
      yearOfPublishing,
      isbn,
      age,
      pageSize,
      pageNumber);
  }

  @GetMapping(value = "/{id}")
  BookDto findBookById(@PathVariable(value = "id") int bookId) {
    return bookService.findBookById(bookId);
  }

  @GetMapping()
  List<BookDto> getAllBooks() {
    return bookService.findAllBooks();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  BookDto createBook(@RequestBody BookDto book) {
    return bookService.createBook(book);
  }

  @PutMapping(value = "/{id}")
  BookDto updateBook(@RequestBody BookDtoImpl book, @PathVariable(value = "id") int bookId) {
    book.setId(bookId);
    return bookService.updateBook(book);
  }

  @DeleteMapping(value = "/{id}")
  void deleteBook(@PathVariable(value = "id") int bookId) {
    bookService.deleteBook(bookId);
  }
}
