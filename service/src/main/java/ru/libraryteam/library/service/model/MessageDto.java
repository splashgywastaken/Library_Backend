package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.db.entity.complex.id.MessageId;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

public class MessageDto {

  private MessageId id;

  @JsonProperty(value = "message_body")
  private String messageBody;

  private SimpleUserMessageDto user;

  public String getMessageBody() {
    return messageBody;
  }

  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }

  @JsonIgnore
  public MessageId getId() {
    return id;
  }

  public void setId(MessageId id) {
    this.id = id;
  }

  public SimpleUserMessageDto getUser() {
    return user;
  }

  public void setUser(SimpleUserMessageDto user) {
    this.user = user;
  }
}
