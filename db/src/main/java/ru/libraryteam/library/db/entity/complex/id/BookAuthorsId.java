package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class BookAuthorsId implements Serializable {

  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "author_id")
  private Integer authorId;

  //bookId
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  //authorId
  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BookAuthorsId that = (BookAuthorsId) o;
    return Objects.equals(bookId, that.bookId) && Objects.equals(authorId, that.authorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, authorId);
  }
}
