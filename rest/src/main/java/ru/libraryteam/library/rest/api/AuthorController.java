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

  private final AuthorService service;

  @Autowired
  public AuthorController(AuthorService service) {
    this.service = service;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  AuthorDto createAuthor(@RequestBody AuthorDto author) {
    return service.createAuthor(author);
  }

  @PutMapping("/{id}")
  AuthorDto updateAuthor(@RequestBody AuthorDtoImpl author, @PathVariable int id) {
    author.setId(id);
    return service.updateAuthor(author);
  }

  @DeleteMapping("/{id}")
  void deleteAuthor(@PathVariable int id) {
    service.deleteAuthor(id);
  }

}
