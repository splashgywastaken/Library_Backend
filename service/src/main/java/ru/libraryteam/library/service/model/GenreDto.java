package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableGenreDto.class)
public interface GenreDto {

  public Integer getId();

  @JsonProperty("genre_name")
  public String getGenreName();
}
