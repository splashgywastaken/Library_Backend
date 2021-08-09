package ru.libraryteam.library.service.logic.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.provider.ReviewProvider;
import ru.libraryteam.library.db.repository.MessageRepository;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.logic.MessageService;
import ru.libraryteam.library.service.mapper.MessageMapper;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.create.dto.MessageCreateDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;
import ru.libraryteam.library.service.security.Profile;

import java.util.List;

@Service
@Validated
public class MessageServiceImpl implements MessageService {
  private final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

  private final MessageRepository messageRepository;
  private final MessageMapper messageMapper;

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  private final ReviewProvider reviewProvider;
  private final ObjectProvider<Profile> profileProvider;

  @Autowired
  public MessageServiceImpl(
    MessageRepository messageRepository,
    MessageMapper messageMapper,
    UserRepository userRepository,
    UserMapper userMapper,
    ReviewProvider reviewProvider,
    ObjectProvider<Profile> profileProvider) {
    this.messageRepository = messageRepository;
    this.messageMapper = messageMapper;
    this.userRepository = userRepository;
    this.userMapper = userMapper;
    this.reviewProvider = reviewProvider;
    this.profileProvider = profileProvider;
  }

  @Override
  public MessageDto findById(int id) {
    return messageMapper.fromEntity(
      messageRepository.findById(id)
      .orElse(null)
    );
  }

  @Override
  @Transactional
  public MessageDto createValidMessage(MessageCreateDto dto) {
    logger.info("User {} requested to create new entity", profileProvider.getIfAvailable());

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
  public void deleteMessage(int id) {
    messageRepository.deleteById(id);
  }

  @Override
  public List<MessageDto> findAllById(int bookId) {
    return messageMapper.fromEntities(
      messageRepository.getAllByBookId(bookId)
    );
  }
}
