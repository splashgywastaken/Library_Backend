package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.MessageRepository;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.logic.MessageService;
import ru.libraryteam.library.service.mapper.MessageMapper;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

@Service
public class MessageServiceImpl implements MessageService {

  private final MessageRepository messageRepository;
  private final MessageMapper messageMapper;

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Autowired
  public MessageServiceImpl(
    MessageRepository messageRepository,
    MessageMapper messageMapper,
    UserRepository userRepository,
    UserMapper userMapper) {
    this.messageRepository = messageRepository;
    this.messageMapper = messageMapper;
    this.userRepository = userRepository;
    this.userMapper = userMapper;
  }


  @Override
  public MessageDto findById(int id) {
    return messageMapper.fromEntity(
      messageRepository.findById(id)
      .orElse(null)
    );
  }

  @Override
  public MessageDto createMessage(MessageDto dto) {
    var user = userMapper.fromEntity(
      userRepository
        .findById(dto.getUserId())
        .orElse(null)
    );

    var dtoUser = new SimpleUserDto();

    dtoUser.setId(user.getId());
    dtoUser.setFirstName(user.getFirstName());
    dtoUser.setLastName(user.getLastName());
    dtoUser.setMiddleName(user.getMiddleName());
    dto.setUser(dtoUser);

    return messageMapper.fromEntity(
      messageRepository.save(
        messageMapper.toEntity(dto)
      )
    );
  }

  @Override
  public MessageDto updateMessage(MessageDto dto) {
    return createMessage(dto);
  }

  @Override
  public void deleteMessage(int id) {
    messageRepository.deleteById(id);
  }
}
