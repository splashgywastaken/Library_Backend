package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutableReviewDto.Builder.class)
public interface ReviewDto {
  @Nullable
  public Integer getId();

  @JsonProperty("user_mark")
  public int getReviewRating();
}
