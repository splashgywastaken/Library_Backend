package ru.libraryteam.library.db.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NamedEntityGraph(
  name = "author-with-books",
  attributeNodes = {
    @NamedAttributeNode("id"),
    @NamedAttributeNode("firstName"),
    @NamedAttributeNode("lastName"),
    @NamedAttributeNode(value = "books", subgraph = "books")
  },
  subgraphs = {
    @NamedSubgraph(
      name = "books",
      attributeNodes = {
        @NamedAttributeNode("id"),
        @NamedAttributeNode("bookName"),
        @NamedAttributeNode("yearOfPublishing"),
        @NamedAttributeNode("quantity")
      }
    )
  }
)
@Table(schema = "library", name = "authors")
@Entity(name = "authors")
public class AuthorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "author_id")
  private Integer id;

  @Column(name = "author_first_name")
  private String firstName;

  @Column(name = "author_last_name")
  private String lastName;

  @Column(name = "author_middle_name")
  private String middleName;

  @Column(name = "pseudonym")
  private String pseudonym;

  @Column(name = "author_birthday")
  private LocalDate birthday;

  @Column(name = "author_sex")
  private String sex;

  @ManyToMany
  @JoinTable(
    joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "author_id"),
    inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
    name = "book_authors",
    schema = "library")
  private List<BookEntity> books;

  //id
  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  //firstName
  public String getFirstName() { return firstName; }

  public void setFirstName(String firstName) { this.firstName = firstName; }

  //lastName
  public String getLastName() { return lastName; }

  public void setLastName(String lastName) { this.lastName = lastName; }

  //middleName
  public String getMiddleName() { return middleName; }

  public void setMiddleName(String middleName) { this.middleName = middleName; }

  //pseudonym
  public String getPseudonym() { return pseudonym; }

  public void setPseudonym(String pseudonym) { this.pseudonym = pseudonym; }

  //birthday
  public LocalDate getBirthday() { return birthday; }

  public void setBirthday(LocalDate birthday) { this.birthday = birthday; }

  //sex
  public String getSex() { return sex; }

  public void setSex(String sex) { this.sex = sex; }

  //books
  public List<BookEntity> getBooks() {
    return books;
  }

  public void setBooks(List<BookEntity> books) {
    this.books = books;
  }
}
