package ru.libraryteam.library.db.entity.complex.id;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class BookGenresId implements Serializable {

  @Column(name = "book_id")
  private Integer bookId;

  @Column(name = "genre_id")
  private Integer genreId;

  //bookId
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  //genreId
  public Integer getGenreId() {
    return genreId;
  }

  public void setGenreId(Integer genreId) {
    this.genreId = genreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BookGenresId that = (BookGenresId) o;
    return Objects.equals(bookId, that.bookId) && Objects.equals(genreId, that.genreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, genreId);
  }
}
