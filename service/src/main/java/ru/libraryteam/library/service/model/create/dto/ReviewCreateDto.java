package ru.libraryteam.library.service.model.create.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ReviewCreateDto {

  private Integer id;

  @JsonProperty("user_mark")
  @NotNull(message = "user_mark.is-null")
  @Pattern(regexp = "^[1-5]$", message = "user_mark.out-of-range(1-5) or you've not used an one digit number")
  private String reviewRating;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getReviewRating() {
    return reviewRating;
  }

  public void setReviewRating(String reviewRating) {
    this.reviewRating = reviewRating;
  }
}
