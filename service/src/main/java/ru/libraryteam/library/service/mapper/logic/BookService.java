package ru.libraryteam.library.service.mapper.logic;

import ru.libraryteam.library.service.mapper.dto.BookDto;

import java.util.List;

public interface BookService {

  BookDto createBook(BookDto bookDto);

  BookDto findById(int id);

  List<BookDto> findAll();

  BookDto updateBook(BookDto bookDto);

  void deleteBook(int id);
}
