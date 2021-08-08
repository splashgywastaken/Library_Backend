package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.db.entity.ReadingState;

import javax.persistence.Column;
import java.sql.Timestamp;

public class ReadingListDto {
  private Integer id;

  @JsonProperty("reading_state")
  private ReadingState readingState;

  private Timestamp readingStartedAt;

  private Timestamp readingFinishedAt;

  @JsonProperty(value = "user_id")
  private Integer userId;

  @JsonProperty(value = "book_id")
  private Integer bookId;

  @JsonProperty("review_id")
  private Integer reviewId;

  @JsonProperty(value = "days_left")
  private Integer daysLeft;

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

  @JsonIgnore
  public Timestamp getReadingStartedAt() {
    return readingStartedAt;
  }

  public void setReadingStartedAt(Timestamp readingStartedAt) {
    this.readingStartedAt = readingStartedAt;
  }

  @JsonIgnore
  public Timestamp getReadingFinishedAt() {
    return readingFinishedAt;
  }

  public void setReadingFinishedAt(Timestamp readingFinishedAt) {
    this.readingFinishedAt = readingFinishedAt;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public Integer getDaysLeft() {
    return daysLeft;
  }

  public void setDaysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
  }

  public Integer getReviewId() {
    return reviewId;
  }

  public void setReviewId(Integer reviewId) {
    this.reviewId = reviewId;
  }
}
