package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.AuthorService;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.impl.AuthorDtoImpl;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  private final AuthorService authorService;

  @Autowired
  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping
  Iterable<AuthorDto> getAllAuthors() {
    return authorService.findAll();
  }

  @GetMapping(value = "/{id}")
  AuthorDto findAuthorById(@PathVariable(value = "id") int authorId) {
    return authorService.findById(authorId);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  AuthorDto createAuthor(@RequestBody AuthorDto author) {
    return authorService.createAuthor(author);
  }

  @PutMapping(value = "/{id}")
  AuthorDto updateAuthor(@RequestBody AuthorDtoImpl author, @PathVariable(value = "id") int authorId) {
    author.setId(authorId);
    return authorService.updateAuthor(author);
  }

  @DeleteMapping(value = "/{id}")
  void deleteAuthor(@PathVariable(value = "id") int authorId) {
    authorService.deleteAuthor(authorId);
  }

}
