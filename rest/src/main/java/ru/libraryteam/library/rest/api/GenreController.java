package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.GenreDto;
import ru.libraryteam.library.service.mapper.logic.GenreService;

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

  @PostMapping
  GenreDto createGenre(@RequestBody GenreDto genre) {
    return service.createGenre(genre);
  }

  @PutMapping("/{id}")
  GenreDto updateGenre(@RequestBody GenreDto genre, @PathVariable int id) {
    genre.setId(id);
    return service.updateGenre(genre);
  }

  @DeleteMapping("/{id}")
  void deleteGenre(@PathVariable int id) { service.deleteGenre(id); }

}
