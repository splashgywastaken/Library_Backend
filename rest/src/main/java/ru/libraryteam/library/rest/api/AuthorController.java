package ru.libraryteam.library.rest.api;

import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.AuthorDto;
import ru.libraryteam.library.service.mapper.logic.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  private final AuthorService service;

  public AuthorController(AuthorService service) {
    this.service = service;
  }

  @GetMapping
  Iterable<AuthorDto> getAuthors() {
    return service.findAll();
  }

  @PostMapping
  AuthorDto createAuthor(@RequestBody AuthorDto author) {
    return service.createAuthor(author);
  }

  @PutMapping("/{id}")
  AuthorDto updateAuthor(@RequestBody AuthorDto author, @PathVariable int id) {
    author.setId(id);
    return service.updateAuthor(author);
  }

  @DeleteMapping("/{id}")
  void deleteAuthor(@PathVariable int id) {
    service.deleteAuthor(id);
  }
}
