package ru.libraryteam.library.service.mapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NoteDto {

  private Integer id;

  @JsonProperty("note_body")
  private String noteBody;

  @JsonProperty("book_id")
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
