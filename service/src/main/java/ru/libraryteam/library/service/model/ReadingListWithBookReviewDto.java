package ru.libraryteam.library.service.model;

import ru.libraryteam.library.service.model.simple.dto.SimpleBookDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

public class ReadingListWithBookReviewDto extends ReadingListDto {
  private ReviewDto review;

  private SimpleBookDto book;

  private SimpleUserDto user;

  public ReviewDto getReview() {
    return review;
  }

  public void setReview(ReviewDto review) {
    this.review = review;
  }

  public SimpleBookDto getBook() {
    return book;
  }

  public void setBook(SimpleBookDto book) {
    this.book = book;
  }

  public SimpleUserDto getUser() {
    return user;
  }

  public void setUser(SimpleUserDto user) {
    this.user = user;
  }
}
