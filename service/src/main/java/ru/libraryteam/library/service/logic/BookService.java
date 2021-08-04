package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.*;
import ru.libraryteam.library.service.model.BookWithAuthorsGenresTagsDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookWithAuthorsGenresDto;

import java.util.List;

public interface BookService {
  BookDto basicCreateBook(BookDto dto);

  BookDto extendedCreateBook(BookWithAuthorsGenresTagsDto dto);

  BookDto updateBook(BookDto dto);

  BookWithAuthorsGenresTagsDto getBookInfo(int bookId);

  List<SimpleBookWithAuthorsGenresDto> getAllBooks();

  void addAuthorToBook(int bookId, int authorId);

  void addGenreToBook(int bookId, int genreId);

  void addTagToBook(int bookId, int tagId);

  void extendedAddAuthorToBook(BookDto book, BookWithAuthorsGenresTagsDto dto);

  void extendedAddGenreToBook(BookDto book, BookWithAuthorsGenresTagsDto dto);

  void extendedAddTagToBook(BookDto book, BookWithAuthorsGenresTagsDto dto);

  void deleteBook(int bookId);

  BookWithAuthorsGenresTagsDto addMessageToBook(int bookId, int authorId, MessageDto dto);

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
