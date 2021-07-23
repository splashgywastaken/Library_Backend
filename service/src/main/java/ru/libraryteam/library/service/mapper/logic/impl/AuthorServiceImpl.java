package ru.libraryteam.library.service.mapper.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.AuthorRepository;
import ru.libraryteam.library.service.mapper.AuthorMapper;
import ru.libraryteam.library.service.mapper.dto.AuthorDto;
import ru.libraryteam.library.service.mapper.logic.AuthorService;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository repository;
  private final AuthorMapper mapper;

  @Autowired
  public AuthorServiceImpl(AuthorRepository repository, AuthorMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public AuthorDto createAuthor(AuthorDto authorDto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(authorDto)
      )
    );
  }

  @Override
  public AuthorDto findById(int id) {
    return mapper.fromEntity(repository.findById(id).orElse(null));

  }

  @Override
  public List<AuthorDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  @Override
  public AuthorDto updateAuthor(AuthorDto authorDto) {
    return createAuthor(authorDto);
  }

  @Override
  public void deleteAuthor(int id) {
    repository.deleteById(id);
  }
}
