package ru.libraryteam.library.service.mapper.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.awt.print.Book;
import java.util.List;

public class AuthorWithBooksDto extends AuthorDto {
  private List<BookDto> books;

  public List<BookDto> getBooks() {
    return books;
  }

  public void setBooks(List<BookDto> books) {
    this.books = books;
  }
}
