package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AchievementDto {

  private Integer id;

  @JsonProperty("name")
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
