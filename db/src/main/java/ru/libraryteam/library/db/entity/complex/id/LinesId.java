package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class LinesId implements Serializable {

  //Fields
  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "user_id")
  private Integer userId;

  //Getters and setters

  //Book id
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
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
    LinesId lines = (LinesId) o;
    return bookId.equals(lines.bookId) && userId.equals(lines.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, userId);
  }
}
