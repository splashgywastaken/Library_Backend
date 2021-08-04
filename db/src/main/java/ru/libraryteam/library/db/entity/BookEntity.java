package ru.libraryteam.library.db.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NamedEntityGraph(
  name = "book-with-authors-genres-tags",
  attributeNodes = {
    @NamedAttributeNode(value = "id"),
    @NamedAttributeNode(value = "bookName"),
    @NamedAttributeNode(value = "yearOfPublishing"),
    @NamedAttributeNode(value = "quantity"),
    @NamedAttributeNode(value = "isbn"),
    @NamedAttributeNode(value = "ageRating"),
    @NamedAttributeNode(value = "language"),
    @NamedAttributeNode(value = "authors", subgraph = "authors"),
    @NamedAttributeNode(value = "genres", subgraph = "genres"),
    @NamedAttributeNode(value = "tags", subgraph = "tags")
  },
  subgraphs = {
    @NamedSubgraph(
      name = "authors",
      attributeNodes = {
        @NamedAttributeNode("id"),
        @NamedAttributeNode("firstName"),
        @NamedAttributeNode("lastName")
      }
    ),
    @NamedSubgraph(
      name = "genres",
      attributeNodes = {
        @NamedAttributeNode("id"),
        @NamedAttributeNode("genreName")
      }
    ),
    @NamedSubgraph(
      name = "tags",
      attributeNodes = {
        @NamedAttributeNode("id"),
        @NamedAttributeNode("tagName")
      }
    )
  }
)
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

  @ManyToMany
  @JoinTable(
    joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "author_id"),
    name = "book_authors",
    schema = "library"
  )
  private Set<AuthorEntity> authors = new HashSet<>();

  @ManyToMany
  @JoinTable(
    joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "genre_id"),
    name = "book_genres",
    schema = "library"
  )
  private Set<GenreEntity> genres = new HashSet<>();

  @ManyToMany
  @JoinTable(
    joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "tag_id"),
    name = "book_tags",
    schema = "library"
  )
  private Set<TagEntity> tags;

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

  //authors
  public Set<AuthorEntity> getAuthors() {
    return authors;
  }

  public void setAuthors(Set<AuthorEntity> authors) {
    this.authors = authors;
  }

  //genres
  public Set<GenreEntity> getGenres() {
    return genres;
  }

  public void setGenres(Set<GenreEntity> genres) {
    this.genres = genres;
  }

  //tags
  public Set<TagEntity> getTags() {
    return tags;
  }

  public void setTags(Set<TagEntity> tags) {
    this.tags = tags;
  }
}
