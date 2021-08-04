package ru.libraryteam.library.db.entity;

import ru.libraryteam.library.db.entity.complex.id.MessageId;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(schema = "library", name = "messages")
@Entity(name = "messages")
public class MessageEntity {

  @EmbeddedId
  private MessageId id;

  @Column(name = "message_title")
  private String messageTitle;

  @Column(name = "message_body")
  private String messageBody;

  @Column(name = "message_post_date")
  private Timestamp messagePostDate;

  @OneToOne
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  private UserEntity user;

  public MessageId getId() {
    return id;
  }

  public void setId(MessageId id) {
    this.id = id;
  }

  public String getMessageTitle() {
    return messageTitle;
  }

  public void setMessageTitle(String messageTitle) {
    this.messageTitle = messageTitle;
  }

  public String getMessageBody() {
    return messageBody;
  }

  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }

  public Timestamp getMessagePostDate() {
    return messagePostDate;
  }

  public void setMessagePostDate(Timestamp messagePostDate) {
    this.messagePostDate = messagePostDate;
  }

  public UserEntity getUser() {
    return user;
  }

  public void setUser(UserEntity user) {
    this.user = user;
  }
}
