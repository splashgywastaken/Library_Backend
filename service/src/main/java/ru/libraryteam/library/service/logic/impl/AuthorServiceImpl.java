package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.AuthorRepository;
import ru.libraryteam.library.service.logic.AuthorService;
import ru.libraryteam.library.service.mapper.AuthorMapper;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.impl.AuthorDtoImpl;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;
  private final AuthorMapper authorMapper;

  @Autowired
  public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper) {
    this.authorRepository = authorRepository;
    this.authorMapper = authorMapper;
  }

  @Override
  public AuthorDto createAuthor(AuthorDto authorDto) {
    return authorMapper.fromEntity(
      authorRepository.save(
        authorMapper.toEntity(authorDto)
      )
    );
  }

  @Override
  public AuthorDto findById(int id) {
    return authorMapper.fromEntity(authorRepository.findById(id).orElse(null));
  }

  @Override
  public List<AuthorDto> findAll() {
    return authorMapper.fromEntities(authorRepository.findAll());
  }

  @Override
  public AuthorDto updateAuthor(AuthorDto authorDto) {
    return createAuthor(authorDto);
  }

  @Override
  public void deleteAuthor(int id) {
    authorRepository.deleteById(id);
  }
}
