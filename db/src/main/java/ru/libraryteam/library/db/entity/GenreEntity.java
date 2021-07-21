package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "genres")
@Entity(name = "genres")
public class GenreEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "genre_id")
  private Integer id;

  @Column(name = "genre_name")
  private String genreName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGenreName() {
    return genreName;
  }

  public void setGenreName(String genreName) {
    this.genreName = genreName;
  }
}
