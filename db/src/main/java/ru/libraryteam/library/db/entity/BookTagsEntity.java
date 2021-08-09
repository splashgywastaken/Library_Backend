package ru.libraryteam.library.db.entity;

import ru.libraryteam.library.db.entity.complex.id.BookTagsId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "book_tags", schema = "library")
@Entity(name = "bookTags")
public class BookTagsEntity {

  @EmbeddedId
  private BookTagsId id;

  public BookTagsId getId() {
    return id;
  }

  public void setId(BookTagsId id) {
    this.id = id;
  }
}
