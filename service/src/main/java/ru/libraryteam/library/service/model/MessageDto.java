package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

public class MessageDto {

  private Integer id;

  @JsonProperty(value = "message_body")
  private String messageBody;

  private SimpleUserMessageDto user;

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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
