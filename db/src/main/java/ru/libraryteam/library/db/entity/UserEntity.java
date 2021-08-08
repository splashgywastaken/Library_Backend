package ru.libraryteam.library.db.entity;

import org.springframework.format.annotation.DateTimeFormat;
import ru.libraryteam.library.commons.Role;

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

  @Column(name = "user_birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthday;

  @Column(name = "email")
  private String email;

  @Column(name = "user_sex")
  private String sex;

  @Column(name = "username")
  private String username;

  @Column(name = "password", columnDefinition = "bpchar")
  private String password;

  @Column(name = "user_role")
  private Role role;

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

  //Birthday
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  //sex
  public void setSex(String sex) { this.sex = sex; }

  public String getSex() { return sex; }

  //username
  public void setUsername(String username) { this.username = username; }

  public String getUsername() { return username; }

  //password
  public void setPassword(String password) { this.password = password; }

  public String getPassword() { return this.password; }

  //User's role
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
