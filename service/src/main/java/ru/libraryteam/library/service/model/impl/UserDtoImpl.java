package ru.libraryteam.library.service.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.libraryteam.library.service.model.UserDto;

import java.time.LocalDate;

@JsonPropertyOrder({
  "first_name",
  "last_name",
  "middle_name",
  "role",
  "email",
  "username"
})
public class UserDtoImpl  implements UserDto {
  private Integer id;

  private String username;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("middle_name")
  private String middleName;

  @JsonProperty("sex")
  private String sex;

  @JsonProperty("email")
  private String email;

  @Override
  public Integer getId() {
    return id;
  }

  @JsonIgnore
  public void setId(Integer id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String getUsername() {
    return username;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @Override
  public String getMiddleName() {
    return middleName;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String getSex() {
    return sex;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String getEmail() {
    return email;
  }
}

