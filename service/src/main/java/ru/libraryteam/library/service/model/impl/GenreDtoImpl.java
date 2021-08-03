package ru.libraryteam.library.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.GenreDto;

public class GenreDtoImpl implements GenreDto {

  private Integer id;

  @JsonProperty("genre_name")
  private String genreName;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getGenreName() {
    return genreName;
  }

  public void setGenreName(String genreName) {
    this.genreName = genreName;
  }
}
