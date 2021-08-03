package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.complex.dto.BookWithAuthorsGenresDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

public interface BookService {

  BookDto createBook();

  BookWithAuthorsGenresDto getBookInfo(int bookId);

  BookWithAuthorsGenresDto addAuthorToBook(int bookId, int authorId);

  List<BookWithAuthorsGenresDto> getAllBooks();

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
