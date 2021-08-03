package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.entity.BookAuthorsEntity;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;
import ru.libraryteam.library.db.repository.BookAuthorsRepository;
import ru.libraryteam.library.db.repository.BookRepository;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.mapper.BookMapper;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.complex.dto.BookWithAuthorsGenresDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;
  private final BookMapper bookMapper;
  private final BookAuthorsRepository bookAuthorsRepository;

  @Autowired
  public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper, BookAuthorsRepository bookAuthorsRepository) {
    this.bookRepository = bookRepository;
    this.bookMapper = bookMapper;
    this.bookAuthorsRepository = bookAuthorsRepository;
  }

  @Override
  public BookDto createBook() {
    return bookMapper.fromEntity(
      bookRepository.save(
        new BookEntity()
      )
    );
  }

  @Override
  public BookWithAuthorsGenresDto getBookInfo(int bookId) {
    return bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenres)
      .orElse(null);
  }

  @Override
  public BookWithAuthorsGenresDto addAuthorToBook(int bookId, int authorId) {
    final var entity = new BookAuthorsEntity();
    final var id = new BookAuthorsId();
    id.setAuthorId(authorId);
    id.setBookId(bookId);
    entity.setId(id);
    var saved = bookAuthorsRepository.save(entity);

    return bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenres)
      .orElse(null);
  }

  @Override
  public List<BookWithAuthorsGenresDto> getAllBooks() {
    return bookMapper.fromEntitiesWithAuthorsGenres(bookRepository.findAll());
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
