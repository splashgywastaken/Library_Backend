package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
  "note_id",
  "user_id",
  "book_id",
  "note_body"
})
public class NoteDto {

  @JsonProperty("note_id")
  private Integer noteId;

  @JsonProperty("note_body")
  private String noteBody;

  @JsonProperty("book_id")
  private Integer bookId;

  @JsonProperty("user_id")
  private Integer userId;

  //Getters and setters

  //Id
  public Integer getNoteId() {
    return noteId;
  }

  public void setNoteId(Integer noteId) {
    this.noteId = noteId;
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

  //User id
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
