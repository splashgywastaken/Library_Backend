package ru.libraryteam.library.service.model.create.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@JsonPropertyOrder({
  "note_id",
  "user_id",
  "book_id",
  "note_body"
})
public class NoteCreateDto {

  private Integer id;

  @JsonProperty("note_body")
  @NotNull(message = "note_body.is-blank")
  @Size(min = 1, max = 250, message = "note_body.out-of-range")
  private String noteBody;

  @JsonProperty("book_id")
  @NotNull(message = "book_id.is-null")
  private Integer bookId;


  @JsonProperty("user_id")
  @NotNull(message = "user_id.is-null")
  private Integer userId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNoteBody() {
    return noteBody;
  }

  public void setNoteBody(String noteBody) {
    this.noteBody = noteBody;
  }

  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
