package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import ru.libraryteam.library.commons.Role;

import java.sql.Date;
import java.time.LocalDate;

@Value.Immutable
@JsonDeserialize(builder = ImmutableUserDto.Builder.class)
@JsonPropertyOrder({
  "id",
  "first_name",
  "last_name",
  "middle_name",
  "birthday",
  "sex",
  "username",
  "email",
  "role"
})
public interface UserDto {

  Integer getId();

  @Nullable
  String getUsername();

  @Nullable
  @JsonProperty("first_name")
  String getFirstName();

  @Nullable
  @JsonProperty("last_name")
  String getLastName();

  @Nullable
  @JsonProperty("middle_name")
  String getMiddleName();

  @Nullable
  @JsonProperty("birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  Date getBirthday();

  @Nullable
  @JsonProperty("sex")
  String getSex();

  @Nullable
  @JsonProperty("email")
  String getEmail();

  @JsonProperty("role")
  Role getRole();

}
