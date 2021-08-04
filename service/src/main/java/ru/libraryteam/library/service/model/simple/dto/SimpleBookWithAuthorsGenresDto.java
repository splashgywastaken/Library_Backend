package ru.libraryteam.library.service.model.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.GenreDto;

import java.util.List;

public class SimpleBookWithAuthorsGenresDto extends SimpleBookDto {

  private List<AuthorDto> authors;

  @JsonProperty(value = "categories")
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
