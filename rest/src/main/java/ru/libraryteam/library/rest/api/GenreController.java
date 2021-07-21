package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.entity.GenreEntity;
import ru.libraryteam.library.db.repository.GenreRepository;

@RestController
@RequestMapping("/genres")
public class GenreController {

  private final GenreRepository genreRepository;

  @Autowired
  public GenreController(GenreRepository genreRepository) {
    this.genreRepository = genreRepository;
  }

  @GetMapping
  Iterable<GenreEntity> getGenres() {
    return genreRepository.findAll();
  }

  @PostMapping
  GenreEntity createGenre(@RequestBody GenreEntity genre) {
    return genreRepository.save(genre);
  }

  @PutMapping("/{id}")
  GenreEntity updateGenre(@RequestBody GenreEntity genre, @PathVariable int id) {
    genre.setId(id);
    return genreRepository.save(genre);
  }

  @DeleteMapping("/{id}")
  void deleteGenre(@PathVariable int id) { genreRepository.deleteById(id);
  }

}
