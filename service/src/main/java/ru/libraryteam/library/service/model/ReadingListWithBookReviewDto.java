package ru.libraryteam.library.service.model;

import ru.libraryteam.library.service.model.simple.dto.SimpleBookReadingListDto;

public class ReadingListWithBookReviewDto extends ReadingListDto {
  private ReviewDto review;

  private SimpleBookReadingListDto book;

  public ReviewDto getReview() {
    return review;
  }

  public void setReview(ReviewDto review) {
    this.review = review;
  }

  public SimpleBookReadingListDto getBook() {
    return book;
  }

  public void setBook(SimpleBookReadingListDto book) {
    this.book = book;
  }
}
