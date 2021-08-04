package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutableGenreDto.Builder.class)
public interface GenreDto {

  @Nullable
  public Integer getId();

  @JsonProperty(value = "genre_name")
  public String getGenreName();
}
