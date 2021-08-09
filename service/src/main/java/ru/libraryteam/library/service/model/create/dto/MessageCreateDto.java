package ru.libraryteam.library.service.model.create.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MessageCreateDto {

  private Integer id;

  @JsonProperty(value = "message_body")
  @NotNull(message = "message_body.is-null")
  @Size(min = 1, max = 200, message = "message_body.out-of-range(1-200 symbols)")
  private String messageBody;

  private SimpleUserDto user;

  @JsonProperty(value = "user_id")
  @NotNull(message = "user_id.is-null")
  private int userId;

  @JsonProperty(value = "book_id")
  @NotNull(message = "book_id.is-null")
  private int bookId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMessageBody() {
    return messageBody;
  }

  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }

  public SimpleUserDto getUser() {
    return user;
  }

  public void setUser(SimpleUserDto user) {
    this.user = user;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
}
