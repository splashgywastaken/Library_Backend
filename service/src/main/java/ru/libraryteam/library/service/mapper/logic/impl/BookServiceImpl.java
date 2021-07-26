package ru.libraryteam.library.service.mapper.logic.impl;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.BookRepository;
import ru.libraryteam.library.service.mapper.BookMapper;
import ru.libraryteam.library.service.mapper.dto.BookDto;
import ru.libraryteam.library.service.mapper.logic.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository repository;
  private final BookMapper mapper;


  public BookServiceImpl(BookRepository repository, BookMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }


  @Override
  public BookDto createBook(BookDto bookDto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(bookDto)
      )
    );
  }

  @Override
  public BookDto findById(int id) {
    return mapper
      .fromEntity(
        repository
        .findById(id)
        .orElse(null)
    );
  }

  @Override
  public List<BookDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  @Override
  public BookDto updateBook(BookDto bookDto) {
    return createBook(bookDto);
  }

  @Override
  public void deleteBook(int id) {
    repository.deleteById(id);
  }
}
