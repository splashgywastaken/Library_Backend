package ru.libraryteam.library.service.model.create.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.TagDto;
import ru.libraryteam.library.service.validation.IsbnUnique;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class BookCreateDto {

  @JsonProperty("book_name")
  @Size(max = 100, message = "book_name.out-of-range")
  @NotNull(message = "book_name.is-null")
  private String bookName;

  @JsonProperty("publication_year")
  @NotNull(message = "publication_year.is-null")
  private Integer yearOfPublishing;

  @IsbnUnique
  @JsonProperty("isbn")
  @Size(max = 20, message = "isbn.out-of-range")
  @NotNull(message = "isbn.is-null")
  private String isbn;

  @JsonProperty("ages")
  @Size(max = 20, message = "ages.out-of-range")
  @NotNull(message = "ages.is-null")
  private String ageRating;

  @JsonProperty("language")
  @Size(max = 30, message = "language.out-of-range")
  @NotNull(message = "language.is-null")
  private String language;

  @JsonProperty("quantity")
  @NotNull(message = "quantity.is-null")
  private Integer quantity;

  @JsonProperty("authors")
  @NotNull(message = "authors.is-null")
  private List<AuthorDto> authors;

  @JsonProperty("tags")
  @NotNull(message = "tags.is-null")
  private List<TagDto> tags;

  @JsonProperty("categories")
  @NotNull(message = "categories.is-null")
  private List<GenreDto> genres;

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

  public List<AuthorDto> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorDto> authors) {
    this.authors = authors;
  }

  public List<TagDto> getTags() {
    return tags;
  }

  public void setTags(List<TagDto> tags) {
    this.tags = tags;
  }

  public List<GenreDto> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreDto> genres) {
    this.genres = genres;
  }
}
