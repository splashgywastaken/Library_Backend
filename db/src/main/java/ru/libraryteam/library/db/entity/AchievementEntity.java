package ru.libraryteam.library.db.entity;

import javax.persistence.*;

@Table(schema = "library", name = "achievements")
@Entity(name = "achievements")
public class AchievementEntity {
  //Fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "achievement_id")
  private Integer id;

  @Column(name = "achievement_name")
  private String name;

  //Get and Set methods

  //Id
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  //Name
  public void setName(String name) { this.name = name; }

  public String getName() { return name; }
}
