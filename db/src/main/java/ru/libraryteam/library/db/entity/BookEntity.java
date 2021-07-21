package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "books")
@Entity(name = "books")
public class BookEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  private Integer id;

  @Column(name = "book_name")
  private String bookName;

  @Column(name = "year_of_publishing")
  private Integer yearOfPublishing;

  @Column(name = "quantity")
  private Integer quantity;

  @Column(name = "isbn")
  private String isbn;

  @Column(name = "age_rating")
  private String ageRating;

  @Column(name = "language")
  private String language;

  //id
  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  //bookName
  public String getBookName() { return bookName; }

  public void setBookName(String bookName) { this.bookName = bookName; }

  //yearOfPublishing
  public Integer getYearOfPublishing() { return yearOfPublishing; }

  public void setYearOfPublishing(Integer yearOfPublishing) { this.yearOfPublishing = yearOfPublishing; }

  //quantity
  public Integer getQuantity() { return quantity; }

  public void setQuantity(Integer quantity) { this.quantity = quantity; }

  //isbn
  public String getIsbn() { return isbn; }

  public void setIsbn(String isbn) { this.isbn = isbn; }

  //ageRating
  public String getAgeRating() { return ageRating; }

  public void setAgeRating(String ageRating) { this.ageRating = ageRating; }

  //language
  public String getLanguage() { return language; }

  public void setLanguage(String language) { this.language = language; }
}
