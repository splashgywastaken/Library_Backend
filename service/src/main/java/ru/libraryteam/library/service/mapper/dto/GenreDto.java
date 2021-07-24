package ru.libraryteam.library.service.mapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenreDto {

  private Integer id;

  @JsonProperty("name")
  private String genreName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGenreName() {
    return genreName;
  }

  public void setGenreName(String genreName) {
    this.genreName = genreName;
  }
}
