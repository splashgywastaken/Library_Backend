package ru.libraryteam.library.service.model.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleUserMessageDto {

  private Integer id;

  @JsonProperty(value = "first_name")
  private String firstName;

  @JsonProperty(value = "last_name")
  private String lastName;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
