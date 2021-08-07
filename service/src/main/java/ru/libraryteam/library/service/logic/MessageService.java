package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.MessageDto;

public interface MessageService {
  MessageDto findById(int id);

  MessageDto createMessage(MessageDto dto);

  MessageDto updateMessage(MessageDto dto);

  void deleteMessage(int id);
}
