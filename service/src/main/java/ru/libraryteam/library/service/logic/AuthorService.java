package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.AuthorWithBooksDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

public interface AuthorService {

  AuthorDto createAuthor(AuthorDto authorDto);

  AuthorDto findById(int id);

  List<AuthorDto> findAll();

  AuthorDto updateAuthor(AuthorDto authorDto);

  void deleteAuthor(int id);

  AuthorWithBooksDto getAuthorInfo(int authorId);

  AuthorWithBooksDto addBookToAuthor(int authorId, int bookId);

  List<AuthorWithBooksDto> getAuthors();

}
