package ru.libraryteam.library.db.entity;

import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;

import javax.persistence.*;

@Table(name = "book_authors", schema = "library")
@Entity(name = "bookAuthors")
public class BookAuthorsEntity {

  @EmbeddedId
  private BookAuthorsId id;

  @ManyToOne
  @JoinColumn(
    name = "book_id",
    referencedColumnName = "book_id",
    insertable = false,
    updatable = false)
  private BookEntity book;


  public BookAuthorsId getId() {
    return id;
  }

  public void setId(BookAuthorsId id) {
    this.id = id;
  }

  public BookEntity getBook() {
    return book;
  }

  public void setBook(BookEntity book) {
    this.book = book;
  }
}
