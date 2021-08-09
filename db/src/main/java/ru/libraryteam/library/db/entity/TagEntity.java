package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "tags")
@Entity(name = "tags")
public class TagEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "tag_id")
  private Integer id;

  @Column(name = "tag_name")
  private String tagName;

  //id
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  //tagName
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }
}
