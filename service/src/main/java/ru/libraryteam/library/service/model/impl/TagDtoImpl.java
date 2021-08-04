package ru.libraryteam.library.service.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.libraryteam.library.service.model.TagDto;

public class TagDtoImpl implements TagDto {

  private Integer id;

  @JsonProperty("tag_name")
  private String tagName;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }
}
