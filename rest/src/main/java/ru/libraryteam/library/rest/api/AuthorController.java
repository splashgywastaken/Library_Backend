package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.AuthorDto;
import ru.libraryteam.library.service.mapper.dto.AuthorWithBooksDto;
import ru.libraryteam.library.service.mapper.logic.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  private final AuthorService service;

  @Autowired
  public AuthorController(AuthorService service) {
    this.service = service;
  }

 /* @GetMapping
  Iterable<AuthorDto> getAuthors() {
    return service.findAll();
  }*/

  @PostMapping
  AuthorDto createAuthor(@RequestBody AuthorDto author) {
    return service.createAuthor(author);
  }

 /* @PutMapping("/{id}")
  AuthorDto updateAuthor(@RequestBody AuthorDto author, @PathVariable int id) {
    author.setId(id);
    return service.updateAuthor(author);
  }

  @DeleteMapping("/{id}")
  void deleteAuthor(@PathVariable int id) {
    service.deleteAuthor(id);
  }*/

  @GetMapping()
  public List<AuthorWithBooksDto> getAllAuthors() {
    return service.getAuthors();
  }

  @GetMapping("/{id}")
  public AuthorWithBooksDto find(@PathVariable("id") int id) {
    return service.getAuthorInfo(id);
  }

  @PutMapping("/{authorId}/books/{bookId}")
  public AuthorWithBooksDto addBook(
    @PathVariable("authorId") int authorId,
    @PathVariable("bookId") int bookId) {
    return service.addBookToAuthor(authorId, bookId);
  }

}
