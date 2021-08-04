package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

@Value.Immutable
@JsonDeserialize(builder = ImmutableTagDto.Builder.class)
public interface TagDto {

  @Nullable
  public Integer getId();

  @JsonProperty("tag_name")
  public String getTagName();
}
