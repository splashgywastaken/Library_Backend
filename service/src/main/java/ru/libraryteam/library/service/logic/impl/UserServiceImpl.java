package ru.libraryteam.library.service.logic.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.db.repository.MessageRepository;
import ru.libraryteam.library.db.repository.ReadingListRepository;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.EntityNotFoundException;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.model.create.dto.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.logic.UserService;
import ru.libraryteam.library.service.security.LibraryPasswordEncoder;
import ru.libraryteam.library.service.security.Profile;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class UserServiceImpl implements UserService {

  private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
  private final UserProvider userProvider;
  private final UserRepository repository;
  private final UserMapper userMapper;
  private final LibraryPasswordEncoder passwordEncoder;
  private final ObjectProvider<Profile> profileProvider;

  private final MessageRepository messageRepository;
  private final ReadingListRepository readingListRepository;

  @Autowired
  public UserServiceImpl(
    UserProvider userProvider,
    UserRepository repository,
    UserMapper userMapper,
    LibraryPasswordEncoder passwordEncoder,
    ObjectProvider<Profile> profileProvider,
    MessageRepository messageRepository,
    ReadingListRepository readingListRepository
  ) {
    this.userProvider = userProvider;
    this.repository = repository;
    this.userMapper = userMapper;
    this.passwordEncoder = passwordEncoder;
    this.profileProvider = profileProvider;
    this.messageRepository = messageRepository;
    this.readingListRepository = readingListRepository;
  }

  @Override
  public UserDto createUser(@Valid UserCreateDto userDto) {

    logger.info("User {} requested to create new entity", profileProvider.getIfAvailable());
//    return userMapper.fromEntity(
//      repository.save(
//        userMapper.toEntity(dto)
//      )
//    );

    userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));

    return Optional.ofNullable(userDto)
      .map(userMapper::toEntity)
      .map(userProvider::save)
      .map(userMapper::fromEntity)
      .orElseThrow();

  }

  @Override
  public UserDto findById(int id) {
    return userMapper.fromEntity(repository.findById(id).orElse(null));
  }

  @Override
  public List<UserDto> findAll() {
    return userMapper.formEntities(repository.findAll());
  }

  @Override
  @Transactional
  public UserDto updateUser(UserDto user) {
    var userEntity = userProvider.findById(user.getId())
      .orElseThrow(() -> new EntityNotFoundException(user.getId(), "User"));

    userMapper.toEntity(user, userEntity);

    return userMapper.fromEntity(userProvider.save(userEntity));

  }

  @Override
  @Transactional
  public void deleteUser(int id) {
    readingListRepository.deleteAllByUserId(id);
    messageRepository.deleteAllByUserId(id);
    repository.deleteById(id);
  }
}
