package ru.libraryteam.library.service.model.simple.dto.userbooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.db.entity.ReadingState;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookDto;

public class SimpleReadingListForUserBooksDto {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("reading_state")
  private ReadingState readingState;

  @JsonProperty(value = "days_left")
  private Integer daysLeft;

  @JsonProperty("book")
  private SimpleBookDto book;

  @JsonProperty("review")
  private ReviewDto review;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ReadingState getReadingState() {
    return readingState;
  }

  public void setReadingState(ReadingState readingState) {
    this.readingState = readingState;
  }

  public Integer getDaysLeft() {
    return daysLeft;
  }

  public void setDaysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
  }

  public SimpleBookDto getBook() {
    return book;
  }

  public void setBook(SimpleBookDto book) {
    this.book = book;
  }

  public ReviewDto getReview() {
    return review;
  }

  public void setReview(ReviewDto review) {
    this.review = review;
  }
}
