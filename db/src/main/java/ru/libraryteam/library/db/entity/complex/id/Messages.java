package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Messages implements Serializable {

  //Fields
  @Column(name = "message_title")
  private String title;

  @Column(name = "message_body")
  private String body;

  @Column(name = "message_post_date")
  private LocalDate postDate;

  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "user_id")
  private Integer userId;

  //Getters and setters

  //Title
  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  //Body
  public void setBody(String body) {
    this.body = body;
  }

  public String getBody() {
    return body;
  }

  //Post date
  public void setPostDate(LocalDate postDate) {
    this.postDate = postDate;
  }

  public LocalDate getPostDate() {
    return postDate;
  }

  //Book id
  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public Integer getBookId() {
    return bookId;
  }

  //User id
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Messages messages = (Messages) o;
    return title.equals(messages.title) && body.equals(messages.body) && postDate.equals(messages.postDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body, postDate);
  }
}
