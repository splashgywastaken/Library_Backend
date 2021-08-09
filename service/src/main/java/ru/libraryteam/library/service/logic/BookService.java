package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.*;
import ru.libraryteam.library.service.model.BookWithAuthorsGenresTagsDto;
import ru.libraryteam.library.service.model.create.dto.BookCreateDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookWithAuthorsGenresDto;

import javax.validation.Valid;
import java.util.List;

public interface BookService {
  BookDto basicCreateBook(BookDto dto);

  BookDto basicCreateBook(BookCreateDto dto);

  BookDto extendedCreateBook(@Valid BookCreateDto dto);

  BookDto updateBook(BookDto dto);

  BookWithAuthorsGenresTagsDto getBookInfo(int bookId);

  PageDto<SimpleBookWithAuthorsGenresDto> getAllBooks(Integer pageSize, Integer pageNumber);

  void addAuthorToBook(int bookId, int authorId);

  void addGenreToBook(int bookId, int genreId);

  void addTagToBook(int bookId, int tagId);

  void extendedAddAuthorToBook(BookDto book, BookCreateDto dto);

  void extendedAddGenreToBook(BookDto book, BookCreateDto dto);

  void extendedAddTagToBook(BookDto book, BookCreateDto dto);

  void deleteBook(int bookId);

  PageDto<BookDto> search(
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
