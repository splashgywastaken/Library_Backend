package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.entity.BookAuthorsEntity;
import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;
import ru.libraryteam.library.db.repository.AuthorRepository;
import ru.libraryteam.library.db.repository.BookAuthorsRepository;
import ru.libraryteam.library.service.model.AuthorWithBooksDto;
import ru.libraryteam.library.service.logic.AuthorService;
import ru.libraryteam.library.service.mapper.AuthorMapper;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;
  private final AuthorMapper authorMapper;
  private final BookAuthorsRepository bookAuthorsRepository;

  @Autowired
  public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper, BookAuthorsRepository bookAuthorsRepository) {
    this.authorRepository = authorRepository;
    this.authorMapper = authorMapper;
    this.bookAuthorsRepository = bookAuthorsRepository;
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

  @Override
  public AuthorWithBooksDto getAuthorInfo(int authorId) {
    return authorRepository
      .findById(authorId)
      .map(authorMapper::fromEntityWithBooks)
      .orElse(null);
  }



  @Override
  public AuthorWithBooksDto addBookToAuthor(int authorId, int bookId) {
    final var entity = new BookAuthorsEntity();
    final var id = new BookAuthorsId();
    id.setAuthorId(authorId);
    id.setBookId(bookId);
    entity.setId(id);
    var saved = bookAuthorsRepository.save(entity);

    return authorRepository
      .findById(authorId)
      .map(authorMapper::fromEntityWithBooks)
      .orElse(null);
  }

  @Override
  public List<AuthorWithBooksDto> getAuthors() {
    return authorMapper.fromEntitiesWithBooks(authorRepository.findAll());
  }
}
