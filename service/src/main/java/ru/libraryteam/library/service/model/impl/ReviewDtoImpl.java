package ru.libraryteam.library.service.model.impl;

import ru.libraryteam.library.service.model.ReviewDto;

public class ReviewDtoImpl implements ReviewDto {

  private Integer id;

  private Integer reviewRating;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public Integer getReviewRating() {
    return reviewRating;
  }

  public void setReviewRating(Integer reviewRating) {
    this.reviewRating = reviewRating;
  }
}
