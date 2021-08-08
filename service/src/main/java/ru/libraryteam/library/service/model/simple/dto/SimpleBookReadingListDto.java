package ru.libraryteam.library.service.model.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleBookReadingListDto {
  private Integer id;

  @JsonProperty("book_name")
  private String bookName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
}
