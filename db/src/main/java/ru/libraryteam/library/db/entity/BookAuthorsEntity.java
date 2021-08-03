package ru.libraryteam.library.db.entity;

import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;

import javax.persistence.*;

@Table(name = "book_authors", schema = "library")
@Entity(name = "bookAuthors")
public class BookAuthorsEntity {

  @EmbeddedId
  private BookAuthorsId id;

  //id
  public BookAuthorsId getId() {
    return id;
  }

  public void setId(BookAuthorsId id) {
    this.id = id;
  }
}
