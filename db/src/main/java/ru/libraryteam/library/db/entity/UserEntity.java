package ru.libraryteam.library.db.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(schema = "library", name = "users")
@Entity(name = "users")
public class UserEntity {
  //Fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer id;

  @Column(name = "user_first_name")
  private String firstName;

  @Column(name = "user_last_name")
  private String lastName;

  @Column(name = "user_middle_name")
  private String middleName;

  @Column(name = "email")
  private String email;

  @Column(name = "user_birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthday;

  @Column(name = "user_sex")
  private String sex;

  @Column(name = "username")
  private String login;

  @Column(name = "password", columnDefinition = "bpchar")
  private String password;

  @Column(name = "achievement_id")
  private Integer achievementId;

  //Set and Get methods

  //Id
  public void setId(Integer id) { this.id = id; }

  public Integer getId () { return id; }

  //firstName
  public void setFirstName(String firstName) { this.firstName = firstName; }

  public String getFirstName() { return firstName; }

  //lastName
  public void setLastName(String lastName) { this.lastName = lastName; }

  public String getLastName() { return lastName; }

  //middleName
  public void setMiddleName(String middleName) { this.middleName = middleName; }

  public String getMiddleName() { return middleName; }

  //email
  public void setEmail(String email) { this.email = email; }

  public String getEmail() { return email; }

  //birthday
  public void setBirthday(LocalDate birthday) { this.birthday = birthday; }

  public LocalDate getBirthday() { return birthday; }

  //sex
  public void setSex(String sex) { this.sex = sex; }

  public String getSex() { return sex; }

  //login
  public void setLogin(String login) { this.login = login; }

  public String getLogin() { return login; }

  //password
  public void setPassword(String password) { this.password = password; }

  public String getPassword() { return password; }

  //Achievements
  public void setAchievementId(Integer achievementId) { this.achievementId = achievementId; }

  public Integer getAchievementId() { return achievementId; }

}
