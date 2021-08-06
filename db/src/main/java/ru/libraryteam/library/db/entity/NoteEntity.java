package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "notes")
@Entity(name = "notes")
public class NoteEntity {

  //Fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "note_id")
  private Integer noteId;

  @Column(name = "note_body")
  private String noteBody;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "book_id")
  private Integer bookId;
  //Getters and setters

  //Id
  public Integer getNoteId() {
    return noteId;
  }

  public void setNoteId(Integer id) {
    this.noteId = id;
  }

  //Note body
  public String getNoteBody() {
    return noteBody;
  }

  public void setNoteBody(String noteBody) {
    this.noteBody = noteBody;
  }

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

}
