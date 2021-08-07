package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Value.Immutable
@JsonDeserialize(builder = ImmutableUserDto.Builder.class)
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
  @JsonProperty("sex")
  String getSex();

  @Nullable
  @JsonProperty("email")
  String getEmail();
}
