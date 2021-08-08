package ru.libraryteam.library.service.model.simple.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleUserDto {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty(value = "first_name")
  private String firstName;

  @JsonProperty(value = "last_name")
  private String lastName;

  @JsonProperty(value = "middle_name")
  private String middleName;

  @JsonIgnore
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

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
}
