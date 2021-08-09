package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
  "id",
  "book_name",
  "authors",
  "categories",
  "publication_year",
  "isbn",
  "quantity",
  "ages",
  "language",
  "tags",
  "comments"
  })
public class BookDto {

  private Integer id;

  @JsonProperty(value = "book_name")
  private String bookName;

  @JsonProperty(value = "publication_year")
  private Integer yearOfPublishing;

  private String isbn;

  @JsonProperty(value = "ages")
  private String ageRating;

  private String language;

  private Integer quantity;

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

  public Integer getYearOfPublishing() {
    return yearOfPublishing;
  }

  public void setYearOfPublishing(Integer yearOfPublishing) {
    this.yearOfPublishing = yearOfPublishing;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAgeRating() {
    return ageRating;
  }

  public void setAgeRating(String ageRating) {
    this.ageRating = ageRating;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}
