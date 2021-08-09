package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.GenreDto;

import java.util.List;

public interface GenreService {
  GenreDto createGenre(GenreDto genreDto);

  GenreDto findById(int id);

  List<GenreDto> findAll();

  GenreDto updateGenre(GenreDto genreDto);

  void deleteGenre(int id);
}
