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

  @GetMapping("/search-book")
  PageDto<BookDto> newFindBooks(
    @RequestParam(name = "author", required = false) List<String> authors,
    @RequestParam(name = "genre", required = false) List<String> genres,
    @RequestParam(name = "tag", required = false) List<String> tags,
    @RequestParam(name = "book_name", required = false, defaultValue = "") String bookName,
    @RequestParam(name = "year", required = false, defaultValue = "0") Integer yearOfPublishing,
    @RequestParam(name = "isbn", required = false, defaultValue = "") String isbn,
    @RequestParam(name = "age", required = false, defaultValue = "") String age,
    @RequestParam(name = "page_size", defaultValue = "10") Integer pageSize,
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

    return service.newFind(
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
