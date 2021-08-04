package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BookWithAuthorsGenresTagsDto extends BookDto {

  private List<AuthorDto> authors;

  @JsonProperty(value = "categories")
  private List<GenreDto> genres;

  private List<TagDto> tags;

  @JsonProperty(value = "comments")
  private List<MessageDto> messages;

  public List<AuthorDto> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorDto> authors) {
    this.authors = authors;
  }

  public List<GenreDto> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreDto> genres) {
    this.genres = genres;
  }

  public List<TagDto> getTags() {
    return tags;
  }

  public void setTags(List<TagDto> tags) {
    this.tags = tags;
  }

  public List<MessageDto> getMessages() {
    return messages;
  }

  public void setMessages(List<MessageDto> messages) {
    this.messages = messages;
  }
}
