package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "notes")
@Entity(name = "notes")
public class NoteEntity {

  //Fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "note_id")
  private Integer id;

  @Column(name = "note_body")
  private String noteBody;

  @Column(name = "book_id")
  private Integer bookId;

  //Getters and setters

  //Id
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  //Note body
  public String getNoteBody() {
    return noteBody;
  }

  public void setNoteBody(String noteBody) {
    this.noteBody = noteBody;
  }

  //Book id
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }
}
