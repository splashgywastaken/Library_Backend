package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

import javax.validation.constraints.NotNull;

public class MessageDto {

  private Integer id;

  @NotNull
  @JsonProperty(value = "message_body")
  private String messageBody;

  private SimpleUserDto user;

  @JsonProperty(value = "user_id")
  private int userId;

  @JsonProperty(value = "book_id")
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
