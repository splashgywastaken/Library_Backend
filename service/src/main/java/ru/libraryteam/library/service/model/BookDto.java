package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutableBookDto.Builder.class)
public interface BookDto {

  @Nullable
  Integer getId();

  @JsonProperty("name")
  String getBookName();

  @JsonProperty("year_of_publ")
  Integer getYearOfPublishing();

  @JsonProperty("isbn")
  String getIsbn();

  @JsonProperty("age_rating")
  String getAgeRating();

  String getLanguage();

  Integer getQuantity();
}
