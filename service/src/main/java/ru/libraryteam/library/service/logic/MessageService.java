package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.MessageDto;

import java.util.List;

public interface MessageService {
  MessageDto findById(int id);

  MessageDto createMessage(MessageDto dto);

  MessageDto updateMessage(MessageDto dto);

  void deleteMessage(int id);

  List<MessageDto> findAllById(int bookId);
}
