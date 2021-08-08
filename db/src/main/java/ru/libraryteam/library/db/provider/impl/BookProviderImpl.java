package ru.libraryteam.library.db.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.db.provider.BookProvider;
import ru.libraryteam.library.db.repository.BookRepository;

@Component
public class BookProviderImpl implements BookProvider {

  private final BookRepository bookRepository;

  @Autowired
  public BookProviderImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public boolean isIsbnExists(String value) {
    return bookRepository.existsByIsbnIgnoreCase(value);
  }

  @Override
  public boolean isIsbnExists(String value, int id) {
    return bookRepository.existsByIdIsNotAndIsbnIgnoreCase(id, value);
  }
}
