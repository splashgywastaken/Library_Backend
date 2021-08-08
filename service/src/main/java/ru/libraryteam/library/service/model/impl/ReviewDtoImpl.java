package ru.libraryteam.library.service.model.impl;

import ru.libraryteam.library.service.model.ReviewDto;

public class ReviewDtoImpl implements ReviewDto {

  private Integer id;

  private int reviewRating;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public int getReviewRating() {
    return reviewRating;
  }

  public void setReviewRating(int reviewRating) {
    this.reviewRating = reviewRating;
  }
}
