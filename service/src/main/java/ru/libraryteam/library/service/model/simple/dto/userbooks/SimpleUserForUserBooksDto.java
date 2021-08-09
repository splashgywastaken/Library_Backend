package ru.libraryteam.library.service.model.simple.dto.userbooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.format.annotation.DateTimeFormat;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

import java.sql.Date;
import java.util.List;

@JsonPropertyOrder({
  "id",
  "first_name",
  "last_name",
  "middle_name",
  "sex",
  "birthday",
  "lists"
})
public class SimpleUserForUserBooksDto extends SimpleUserDto {

  @JsonProperty("sex")
  private String sex;

  @JsonProperty("birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date birthday;

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  private List<SimpleReadingListForUserBooksDto> lists;

  public List<SimpleReadingListForUserBooksDto> getLists() {
    return lists;
  }

  public void setLists(List<SimpleReadingListForUserBooksDto> lists) {
    this.lists = lists;
  }
}
