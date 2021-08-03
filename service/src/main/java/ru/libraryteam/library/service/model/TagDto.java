package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class TagDto {

  private Integer id;

  @JsonProperty("tag_name")
  private String tagName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }
}
