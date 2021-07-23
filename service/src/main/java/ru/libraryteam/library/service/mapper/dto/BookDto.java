package ru.libraryteam.library.service.mapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDto {

  private Integer id;

  @JsonProperty("book_name")
  private String bookName;

  @JsonProperty("year_of_publication")
  private Integer yearOfPublishing;

  @JsonProperty("isbn")
  private String isbn;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("age_rating")
  private String ageRating;

  @JsonProperty("language")
  private String language;

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

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
}
