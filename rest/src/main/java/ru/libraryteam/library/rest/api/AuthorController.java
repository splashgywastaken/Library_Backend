package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.db.repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

  private final AuthorRepository authorRepository;

  @Autowired
  public AuthorController(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  @GetMapping
  Iterable<AuthorEntity> getAuthors() {
    return authorRepository.findAll();
  }


  @PostMapping
  AuthorEntity createAuthor(@RequestBody AuthorEntity author) {
    return authorRepository.save(author);
  }

  @PutMapping("/{id}")
  AuthorEntity updateAuthor(@RequestBody AuthorEntity author, @PathVariable int id) {
    author.setId(id);
    return authorRepository.save(author);
  }

  @DeleteMapping("/{id}")
  void deleteAuthor(@PathVariable int id) {
    authorRepository.deleteById(id);
  }
}
