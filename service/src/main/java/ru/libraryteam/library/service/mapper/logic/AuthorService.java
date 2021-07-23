package ru.libraryteam.library.service.mapper.logic;

import ru.libraryteam.library.service.mapper.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

  AuthorDto createAuthor(AuthorDto authorDto);

  AuthorDto findById(int id);

  List<AuthorDto> findAll();

  AuthorDto updateAuthor(AuthorDto authorDto);

  void deleteAuthor(int id);
}
