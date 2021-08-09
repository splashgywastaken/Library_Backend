package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.create.dto.MessageCreateDto;
import ru.libraryteam.library.service.model.create.dto.ReviewCreateDto;

import javax.validation.Valid;
import java.util.List;

public interface MessageService {
  MessageDto findById(int id);

  MessageDto createValidMessage(@Valid MessageCreateDto dto);

  void deleteMessage(int id);

  List<MessageDto> findAllById(int bookId);
}
