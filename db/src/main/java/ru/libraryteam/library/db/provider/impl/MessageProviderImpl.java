package ru.libraryteam.library.db.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.provider.MessageProvider;
import ru.libraryteam.library.db.repository.MessageRepository;

import java.util.Optional;

@Component
public class MessageProviderImpl implements MessageProvider {

  private final MessageRepository messageRepository;

  @Autowired
  public MessageProviderImpl(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  @Override
  public MessageEntity save(MessageEntity entity) {
    return messageRepository.save(entity);
  }

  @Override
  public Optional<MessageEntity> findById(int id) {
    return messageRepository.findById(id);
  }
}
