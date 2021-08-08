package ru.libraryteam.library.db.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Table(schema = "library", name = "reading_lists")
@Entity(name = "reading_lists")
public class ReadingListEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "reading_list_id")
  private Integer id;

  @Column(name = "reading_started_at")
  private Timestamp readingStartedAt;

  @Column(name = "reading_finished_at")
  private Timestamp readingFinishedAt;

  @Column(name = "reading_state_id")
  private ReadingState readingState;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "review_id", referencedColumnName = "review_id", insertable = false, updatable = false)
  private ReviewEntity review;

  @ManyToOne
  @JoinColumn(name = "book_id", referencedColumnName = "book_id", insertable = false, updatable = false)
  private BookEntity book;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
  private UserEntity user;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "review_id")
  private Integer reviewId;

  @Column(name = "days_left")
  private Integer daysLeft;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Timestamp getReadingStartedAt() {
    return readingStartedAt;
  }

  public void setReadingStartedAt(Timestamp readingStartedAt) {
    this.readingStartedAt = readingStartedAt;
  }

  public Timestamp getReadingFinishedAt() {
    return readingFinishedAt;
  }

  public void setReadingFinishedAt(Timestamp readingFinishedAt) {
    this.readingFinishedAt = readingFinishedAt;
  }

  public ReadingState getReadingState() {
    return readingState;
  }

  public void setReadingState(ReadingState readingState) {
    this.readingState = readingState;
  }

  public ReviewEntity getReview() {
    return review;
  }

  public void setReview(ReviewEntity review) {
    this.review = review;
  }

  public BookEntity getBook() {
    return book;
  }

  public void setBook(BookEntity book) {
    this.book = book;
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

  public UserEntity getUser() {
    return user;
  }

  public void setUser(UserEntity user) {
    this.user = user;
  }
}
