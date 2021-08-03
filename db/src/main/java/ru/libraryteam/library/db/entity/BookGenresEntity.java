package ru.libraryteam.library.db.entity;

import ru.libraryteam.library.db.entity.complex.id.BookGenresId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "book_genres", schema = "library")
@Entity(name = "bookGenres")
public class BookGenresEntity {

  @EmbeddedId
  private BookGenresId id;

  public BookGenresId getId() {
    return id;
  }

  public void setId(BookGenresId id) {
    this.id = id;
  }
}
