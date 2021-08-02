package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.BookRepository;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.mapper.BookMapper;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;
  private final BookMapper bookMapper;

  @Autowired
  public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
    this.bookRepository = bookRepository;
    this.bookMapper = bookMapper;
  }

  @Override
  public BookDto findBookById(int id) {
    return bookMapper.fromEntity(
        bookRepository.findById(id)
        .orElse(null)
    );
  }

  @Override
  public List<BookDto> findAllBooks() {
    return bookMapper.fromEntities(bookRepository.findAll());
  }

  @Override
  public BookDto createBook(BookDto dto) {
    return bookMapper.fromEntity(
      bookRepository.save(
        bookMapper.toEntity(dto)
      )
    );
  }

  @Override
  public BookDto updateBook(BookDto dto) {
    return createBook(dto);
  }

  @Override
  public void deleteBook(int id) {
    bookRepository.deleteById(id);
  }

  @Override
  @Transactional
  public PageDto<BookDto> newFind(
    List<String> authorLastName,
    List<String> authorFirstName,
    List<String> genreName,
    List<String> tagName,
    String bookName,
    Integer yearOfPublishing,
    String isbn,
    String ageRating,
    Integer pageSize,
    Integer pageNumber) {
    var values = bookRepository
      .findBooks(
        authorLastName,
        authorFirstName,
        genreName,
        tagName,
        bookName,
        yearOfPublishing,
        isbn,
        ageRating,
        Pageable
        .ofSize(pageSize)
        .withPage(pageNumber)
      ).map(bookMapper::fromEntity);

    return ImmutablePageDto.<BookDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
  }
}
