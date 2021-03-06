package ru.libraryteam.library.service.logic.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.entity.BookAuthorsEntity;
import ru.libraryteam.library.db.entity.BookGenresEntity;
import ru.libraryteam.library.db.entity.BookTagsEntity;
import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;
import ru.libraryteam.library.db.entity.complex.id.BookGenresId;
import ru.libraryteam.library.db.entity.complex.id.BookTagsId;
import ru.libraryteam.library.db.repository.*;
import ru.libraryteam.library.service.logic.BookService;
import ru.libraryteam.library.service.mapper.*;
import ru.libraryteam.library.service.model.*;
import ru.libraryteam.library.service.model.create.dto.BookCreateDto;
import ru.libraryteam.library.service.model.impl.AuthorDtoImpl;
import ru.libraryteam.library.service.model.impl.GenreDtoImpl;
import ru.libraryteam.library.service.model.impl.TagDtoImpl;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookWithAuthorsGenresDto;
import ru.libraryteam.library.service.security.Profile;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class BookServiceImpl implements BookService {

  private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

  private final ObjectProvider<Profile> profileProvider;

  private final BookRepository bookRepository;
  private final BookMapper bookMapper;

  private final BookAuthorsRepository bookAuthorsRepository;
  private final BookGenresRepository bookGenresRepository;
  private final BookTagsRepository bookTagsRepository;

  private final MessageRepository messageRepository;
  private final ReadingListRepository readingListRepository;

  private final AuthorRepository authorRepository;
  private final AuthorMapper authorMapper;

  private final GenreRepository genreRepository;
  private final GenreMapper genreMapper;

  private final TagRepository tagRepository;
  private final TagMapper tagMapper;

  @Autowired
  public BookServiceImpl(
    BookRepository bookRepository,
    BookMapper bookMapper,
    BookAuthorsRepository bookAuthorsRepository,
    BookGenresRepository bookGenresRepository,
    BookTagsRepository bookTagsRepository,
    MessageRepository messageRepository,
    ReadingListRepository readingListRepository,
    AuthorRepository authorRepository,
    AuthorMapper authorMapper,
    GenreRepository genreRepository,
    GenreMapper genreMapper,
    TagRepository tagRepository,
    TagMapper tagMapper,
    ObjectProvider<Profile> profileProvider
  ) {
    this.bookRepository = bookRepository;
    this.bookMapper = bookMapper;
    this.bookAuthorsRepository = bookAuthorsRepository;
    this.bookGenresRepository = bookGenresRepository;
    this.bookTagsRepository = bookTagsRepository;
    this.messageRepository = messageRepository;
    this.readingListRepository = readingListRepository;
    this.authorRepository = authorRepository;
    this.authorMapper = authorMapper;
    this.genreRepository = genreRepository;
    this.genreMapper = genreMapper;
    this.tagRepository = tagRepository;
    this.tagMapper = tagMapper;
    this.profileProvider = profileProvider;
  }

  @Override
  public BookDto basicCreateBook(BookDto dto) {
    return bookMapper.fromEntity(
      bookRepository.save(
        bookMapper.toEntity(dto)
      )
    );
  }

  @Override
  public BookDto basicCreateBook(BookCreateDto dto) {
    return bookMapper.fromEntity(
      bookRepository.save(
        bookMapper.toEntity(dto)
      )
    );
  }

  @Override
  @Transactional
  public BookDto extendedCreateBook(BookCreateDto dto) {

    logger.info("User {} requested to create new Entity", profileProvider.getIfAvailable());

    var book  = (BookDto) basicCreateBook(dto);

    extendedAddAuthorToBook(book, dto);

    extendedAddGenreToBook(book, dto);

    extendedAddTagToBook(book, dto);

    return Optional.ofNullable(book).orElseThrow();
  }

  @Override
  public BookDto updateBook(BookDto dto) {
    return basicCreateBook(dto);
  }

  @Override
  public BookWithAuthorsGenresTagsDto getBookInfo(int bookId) {
    return bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenresTags)
      .orElse(null);
  }



  @Override
  public void addAuthorToBook(int bookId, int authorId) {
    final var entity = new BookAuthorsEntity();
    final var id = new BookAuthorsId();
    id.setAuthorId(authorId);
    id.setBookId(bookId);
    entity.setId(id);
    var saved = bookAuthorsRepository.save(entity);

    bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenresTags);
  }

  @Override
  public void addGenreToBook(int bookId, int genreId) {
    final var entity = new BookGenresEntity();
    final var id = new BookGenresId();
    id.setGenreId(genreId);
    id.setBookId(bookId);
    entity.setId(id);
    var saved = bookGenresRepository.save(entity);

    bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenresTags);
  }

  @Override
  public void addTagToBook(int bookId, int tagId) {
    final var entity = new BookTagsEntity();
    final var id = new BookTagsId();
    id.setTagId(tagId);
    id.setBookId(bookId);
    entity.setId(id);
    var saved = bookTagsRepository.save(entity);

    bookRepository
      .findById(bookId)
      .map(bookMapper::fromEntityWithAuthorsGenresTags);
  }

  @Override
  @Transactional
  public void extendedAddAuthorToBook(BookDto book, BookCreateDto dto) {
    if (dto.getAuthors() != null) {
      if (!dto.getAuthors().isEmpty()) {
        for (AuthorDto author : dto.getAuthors()) {
          if (!author.getFirstName().isBlank() && !author.getLastName().isBlank()) {
            var foundAuthor =
              authorRepository.getByFirstNameAndLastName(author.getFirstName(), author.getLastName());

            if (foundAuthor == null) {
              var newAuthor = new AuthorDtoImpl();
              newAuthor.setFirstName(author.getFirstName());
              newAuthor.setLastName(author.getLastName());

              author =  authorMapper.fromEntity(
                authorRepository.save(
                  authorMapper.toEntity(newAuthor)
                )
              );
            }

            if (author.getId() != null && book.getId() != null) {
              addAuthorToBook(book.getId(), author.getId());
            }
          }
        }
      }
    }
  }

  @Override
  @Transactional
  public void extendedAddGenreToBook(BookDto book, BookCreateDto dto) {
    if (dto.getGenres() != null) {
      if (!dto.getGenres().isEmpty()) {
        for (GenreDto genre: dto.getGenres()){
          if (!genre.getGenreName().isBlank()) {
            var foundGenre = genreRepository.getByGenreNameEquals(genre.getGenreName());

            if (foundGenre == null) {
              var newGenre = new GenreDtoImpl();
              newGenre.setGenreName(genre.getGenreName());

              genre = genreMapper.fromEntity(
                genreRepository.save(
                  genreMapper.toEntity(newGenre)
                )
              );
            }

            if (genre.getId() != null && book.getId() != null) {
              addGenreToBook(book.getId(), genre.getId());
            }
          }

        }
      }
    }
  }

  @Override
  @Transactional
  public void extendedAddTagToBook(BookDto book, BookCreateDto dto) {
    if (dto.getTags() != null) {
      if (!dto.getTags().isEmpty()) {
        for (TagDto tag: dto.getTags()){
          if (!tag.getTagName().isBlank()) {
            var foundTag = tagRepository.getByTagNameEquals(tag.getTagName());

            if (foundTag == null) {
              var newTag = new TagDtoImpl() ;
              newTag.setTagName(tag.getTagName());

              tag = tagMapper.fromEntity(
                tagRepository.save(
                  tagMapper.toEntity(newTag)
                )
              );
            }

            if (tag.getId() != null && book.getId() != null) {
              addTagToBook(book.getId(), tag.getId());
            }
          }
        }
      }
    }
  }

  @Override
  @Transactional
  public void deleteBook(int bookId) {
    readingListRepository.deleteAllByBookId(bookId);
    messageRepository.deleteAllByBookId(bookId);
    bookRepository.deleteById(bookId);
  }

  @Override
  public PageDto<SimpleBookWithAuthorsGenresDto> getAllBooks(Integer pageSize, Integer pageNumber) {
    var values = bookRepository.findAll(Pageable
      .ofSize(pageSize)
      .withPage(pageNumber)).map(bookMapper::fromEntityWithAuthorsGenres);
    return ImmutablePageDto.<SimpleBookWithAuthorsGenresDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
  }

  @Override
  @Transactional
  public PageDto<BookDto> search(
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
