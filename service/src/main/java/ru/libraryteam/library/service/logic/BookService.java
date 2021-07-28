package ru.libraryteam.library.service.logic;

import org.springframework.data.domain.Page;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

public interface BookService {

  BookDto createBook(BookDto bookDto);

  BookDto findById(int id);

  List<BookDto> findAll();

  BookDto updateBook(BookDto bookDto);

  void deleteBook(int id);

  PageDto<BookDto> find(String search, Integer pageSize, Integer pageNumber);
}
