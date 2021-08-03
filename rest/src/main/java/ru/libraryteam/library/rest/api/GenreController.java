package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.logic.GenreService;
import ru.libraryteam.library.service.model.impl.GenreDtoImpl;

@RestController
@RequestMapping("/genres")
public class GenreController {
  private final GenreService service;

  @Autowired
  public GenreController(GenreService service) {
    this.service = service;
  }

  @GetMapping
  Iterable<GenreDto> getGenres() {
    return service.findAll();
  }

  @GetMapping(value = "/{id}")
  GenreDto findGenreById(@PathVariable(value = "id") int genreId) {
    return service.findById(genreId);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  GenreDto createGenre(@RequestBody GenreDto genre) {
    return service.createGenre(genre);
  }

  @PutMapping("/{id}")
  GenreDto updateGenre(@RequestBody GenreDtoImpl genre, @PathVariable int id) {
    genre.setId(id);
    return service.updateGenre(genre);
  }

  @DeleteMapping("/{id}")
  void deleteGenre(@PathVariable int id) { service.deleteGenre(id); }

}
