package ru.libraryteam.library.service.model.complex.dto;

import ru.libraryteam.library.db.entity.GenreEntity;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.GenreDto;

import java.util.List;

public class BookWithAuthorsGenresDto extends BookDto {
  private List<AuthorDto> authors;

  private List<GenreDto> genres;

  public List<AuthorDto> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorDto> authors) {
    this.authors = authors;
  }

  public List<GenreDto> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreDto> genres) {
    this.genres = genres;
  }
}
