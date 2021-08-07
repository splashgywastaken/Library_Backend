package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

public class MessageDto {

  private Integer id;

  @JsonProperty(value = "message_body")
  private String messageBody;

  private SimpleUserMessageDto user;

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

  public SimpleUserMessageDto getUser() {
    return user;
  }

  public void setUser(SimpleUserMessageDto user) {
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
