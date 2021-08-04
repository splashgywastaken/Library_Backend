package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class MessageId implements Serializable {

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "book_id")
  private Integer bookId;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MessageId messageId = (MessageId) o;
    return Objects.equals(userId, messageId.userId) && Objects.equals(bookId, messageId.bookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, bookId);
  }
}
