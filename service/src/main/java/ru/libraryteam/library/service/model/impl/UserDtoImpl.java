package ru.libraryteam.library.service.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.libraryteam.library.commons.Role;
import ru.libraryteam.library.service.model.ReadingListDto;
import ru.libraryteam.library.service.model.ReadingListWithBookReviewDto;
import ru.libraryteam.library.service.model.UserDto;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

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

  @JsonProperty("birthday")
  private LocalDate birthday;

  @JsonProperty("role")
  private Role role;

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

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public LocalDate getBirthday() {
    return this.birthday;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public Role getRole() {
    return this.role;
  }
}

