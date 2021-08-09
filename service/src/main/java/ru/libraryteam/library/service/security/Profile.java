package ru.libraryteam.library.service.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.immutables.value.Value;
import ru.libraryteam.library.commons.Role;

@Value.Immutable
@JsonPropertyOrder({
  "id",
  "first_name",
  "last_name",
  "middle_name",
  "sex",
  "username",
  "email",
  "role"
})

public interface Profile {

  int getId();
  String getFirstName();
  String getLastName();
  String getMiddleName();
  String getSex();
  String getEmail();
  String getUsername();
  String getBirthday();
  @JsonIgnore
  String getPassword();
  Role getRole();

}
