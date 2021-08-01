package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class BookTagsId implements Serializable {

  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "tag_id")
  private Integer tagId;

  //bookId
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  //tagId
  public Integer getTagId() {
    return tagId;
  }

  public void setTagId(Integer tagId) {
    this.tagId = tagId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BookTagsId that = (BookTagsId) o;
    return Objects.equals(bookId, that.bookId) && Objects.equals(tagId, that.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, tagId);
  }
}
