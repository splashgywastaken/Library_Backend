package ru.libraryteam.library.service.model.complex.dto;

import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.TagDto;

import java.util.List;

public class BookWithAuthorsGenresTagsDto extends BookDto {
  private List<AuthorDto> authors;

  private List<GenreDto> genres;

  private List<TagDto> tags;

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

  public List<TagDto> getTags() {
    return tags;
  }

  public void setTags(List<TagDto> tags) {
    this.tags = tags;
  }
}
