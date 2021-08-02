package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

public interface BookService {

  BookDto createBook(BookDto bookDto);

  BookDto findById(int id);

  List<BookDto> findAll();

  BookDto updateBook(BookDto bookDto);

  void deleteBook(int id);

  PageDto<BookDto> find(String search, Integer pageSize, Integer pageNumber);

  PageDto<BookDto> newFind(
    List<String> authorLastName,
    List<String> authorFirstName,
    List<String> genreName,
    List<String> tagName,
    String bookName,
    Integer yearOfPublishing,
    String isbn,
    String ageRating,
    Integer pageSize,
    Integer pageNumber);
}
