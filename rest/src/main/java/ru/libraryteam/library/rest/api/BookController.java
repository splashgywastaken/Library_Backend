package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.complex.dto.BookWithAuthorsGenresDto;

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

  @PostMapping
  BookDto createBook(@RequestBody BookDto dto) {
    return bookService.createBook(dto);
  }

  @GetMapping()
  public List<BookWithAuthorsGenresDto> getAllBooks() {
    return bookService.getAllBooks();
  }

  @GetMapping("/{id}")
  public BookWithAuthorsGenresDto findBookById(@PathVariable("id") int bookId) {
    return bookService.getBookInfo(bookId);
  }

  @PutMapping("/{bookId}/authors/{authorId}")
  public BookWithAuthorsGenresDto addAuthor(
    @PathVariable("bookId") int bookId,
    @PathVariable("authorId") int authorId) {
    return bookService.addAuthorToBook(bookId, authorId);
  }
}
