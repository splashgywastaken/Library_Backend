package ru.libraryteam.library.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.AuthorDto;

public class AuthorDtoImpl implements AuthorDto {

  private Integer id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
