package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.BookDto;

import java.util.List;

public interface BookService {

  BookDto createBook(BookDto bookDto);

  BookDto findById(int id);

  List<BookDto> findAll();

  BookDto updateBook(BookDto bookDto);

  void deleteBook(int id);
}
