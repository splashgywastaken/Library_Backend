package ru.libraryteam.library.service.model.create.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ReviewCreateDto {

  @JsonProperty("user_mark")
  @NotNull(message = "user_mark.is-null")
  @NotBlank(message = "user_mark.is-blank")
  @Pattern(regexp = "^[1-5]$", message = "user_mark.out-of-range(1-5)")
  private int reviewRating;

  public int getReviewRating() {
    return reviewRating;
  }

  public void setReviewRating(int reviewRating) {
    this.reviewRating = reviewRating;
  }
}
