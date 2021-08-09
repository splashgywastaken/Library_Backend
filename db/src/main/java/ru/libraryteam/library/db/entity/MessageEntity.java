package ru.libraryteam.library.db.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(schema = "library", name = "messages")
@Entity(name = "messages")
public class MessageEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "message_id")
  private Integer id;

  @Column(name = "message_title")
  private String messageTitle;

  @Column(name = "message_body")
  private String messageBody;

  @Column(name = "message_post_date")
  private Timestamp messagePostDate;

  @Column(name = "user_id")
  private int userId;

  @Column(name = "book_id")
  private int bookId;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
  private UserEntity user;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
