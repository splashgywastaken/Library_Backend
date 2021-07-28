package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDtoImpl implements BookDto {

  private Integer id;

  @JsonProperty("name")
  private String bookName;

  @JsonProperty("year_of_publ")
  private Integer yearOfPublishing;

  private String isbn;

  @JsonProperty("age_rating")
  private String ageRating;

  private String language;

  private Integer quantity;

  @Override
  public Integer getId() {
    return null;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  @Override
  public String getBookName() {
    return null;
  }

  public void setYearOfPublishing(Integer yearOfPublishing) {
    this.yearOfPublishing = yearOfPublishing;
  }

  @Override
  public Integer getYearOfPublishing() {
    return null;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String getIsbn() {
    return null;
  }

  public void setAgeRating(String ageRating) {
    this.ageRating = ageRating;
  }

  @Override
  public String getAgeRating() {
    return null;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String getLanguage() {
    return null;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public Integer getQuantity() {
    return null;
  }
}
