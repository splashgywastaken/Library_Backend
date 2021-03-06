package ru.libraryteam.library.service.model.simple.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
  "id",
  "book_name",
  "authors",
  "categories",
  "publication_year"
})
public class SimpleBookDto {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty(value = "book_name")
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
