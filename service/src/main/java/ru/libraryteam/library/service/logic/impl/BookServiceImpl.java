package ru.libraryteam.library.service.logic.impl;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.BookRepository;
import ru.libraryteam.library.service.mapper.BookMapper;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.model.ImmutableBookDto;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;

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

  @Override
  @Transactional
  public PageDto<BookDto> find(String search, Integer pageSize, Integer pageNumber) {
    var values = repository
      .getAllByBookNameIsContainingOrAgeRatingIsContaining(
        search,
        search,
        Pageable
          .ofSize(pageSize)
          .withPage(pageNumber)
      ).map(mapper::fromEntity);

    return ImmutablePageDto.<BookDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
  }
}
