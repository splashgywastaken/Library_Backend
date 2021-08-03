package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutableAuthorDto.class)
public interface AuthorDto {

  @Nullable
  Integer getId();

  @JsonProperty("first_name")
  String getFirstName();

  @JsonProperty("last_name")
  String getLastName();
}
