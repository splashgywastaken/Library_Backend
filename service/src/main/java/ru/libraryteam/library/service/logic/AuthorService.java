package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.impl.AuthorDtoImpl;

import java.util.List;

public interface AuthorService {

  AuthorDto createAuthor(AuthorDto authorDto);

  AuthorDto findById(int id);

  List<AuthorDto> findAll();

  AuthorDto updateAuthor(AuthorDto authorDto);

  void deleteAuthor(int id);

}
