package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.commons.Role;
import ru.libraryteam.library.service.validation.EmailUnique;
import ru.libraryteam.library.service.validation.UsernameUnique;

import javax.validation.constraints.*;

public class UserCreateDto {

  @UsernameUnique
  @Pattern(regexp = "^[a-zA-Z\\d]{5,32}$", message = "username.invalid")
  @NotNull(message = "username.is-null")
  private String username;

  @NotBlank(message = "password.is-blank")
  @Size(min = 8, max = 32, message = "password.out-of-range")
  private String password;

  @NotNull(message = "role.is-null")
  private Role role;

  @JsonProperty("first_name")
  @NotBlank(message = "first_name.is-blank")
  @Size(min = 1, max = 45, message = "first_name.out-of-range")
  private String firstName;

  @JsonProperty("last_name")
  @NotBlank(message = "middle_name.is-blank")
  @Size(min = 1, max = 45, message = "middle_name.out-of-range")
  private String lastName;

  @JsonProperty("middle_name")
  @NotBlank(message = "first_name.is-blank")
  @Size(min = 1, max = 45, message = "middle_name.out-of-range")
  private String middleName;

  @EmailUnique
  @JsonProperty("email")
  @NotBlank(message = "email.is-blank")
  @Size(min = 6, max = 128, message = "email.out-of-range")
  private String email;

  @JsonProperty("user_sex")
  private Integer sex;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
