package ru.libraryteam.library.db.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(schema = "library", name = "reviews")
@Entity(name = "reviews")
public class ReviewEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "review_id")
  private Integer id;

  @Column(name = "review_title")
  private String reviewTitle;

  @Column(name = "review_body")
  private String reviewBody;

  @Column(name = "review_post_date")
  private Timestamp reviewPostDate;

  @Column(name = "review_rating")
  private Integer reviewRating;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getReviewTitle() {
    return reviewTitle;
  }

  public void setReviewTitle(String reviewTitle) {
    this.reviewTitle = reviewTitle;
  }

  public String getReviewBody() {
    return reviewBody;
  }

  public void setReviewBody(String reviewBody) {
    this.reviewBody = reviewBody;
  }

  public Timestamp getReviewPostDate() {
    return reviewPostDate;
  }

  public void setReviewPostDate(Timestamp reviewPostDate) {
    this.reviewPostDate = reviewPostDate;
  }

  public Integer getReviewRating() {
    return reviewRating;
  }

  public void setReviewRating(Integer reviewRating) {
    this.reviewRating = reviewRating;
  }
}
