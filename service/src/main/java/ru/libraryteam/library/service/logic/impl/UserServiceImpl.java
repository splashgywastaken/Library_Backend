package ru.libraryteam.library.service.logic.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.db.repository.MessageRepository;
import ru.libraryteam.library.db.repository.ReadingListRepository;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.EntityNotFoundException;
import ru.libraryteam.library.service.logic.UserService;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.create.dto.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.userbooks.SimpleUserForUserBooksDto;
import ru.libraryteam.library.service.security.LibraryPasswordEncoder;
import ru.libraryteam.library.service.security.Profile;

import javax.validation.Valid;
import java.util.Optional;

@Service
@Validated
public class UserServiceImpl implements UserService {

  private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
  private final UserProvider userProvider;
  private final UserRepository userRepository;
  private final UserMapper userMapper;
  private final LibraryPasswordEncoder passwordEncoder;
  private final ObjectProvider<Profile> profileProvider;

  private final MessageRepository messageRepository;
  private final ReadingListRepository readingListRepository;

  @Autowired
  public UserServiceImpl(
    UserProvider userProvider,
    UserRepository userRepository,
    UserMapper userMapper,
    LibraryPasswordEncoder passwordEncoder,
    ObjectProvider<Profile> profileProvider,
    MessageRepository messageRepository,
    ReadingListRepository readingListRepository
  ) {
    this.userProvider = userProvider;
    this.userRepository = userRepository;
    this.userMapper = userMapper;
    this.passwordEncoder = passwordEncoder;
    this.profileProvider = profileProvider;
    this.messageRepository = messageRepository;
    this.readingListRepository = readingListRepository;
  }

  @Override
  public UserDto createUser(@Valid UserCreateDto userDto) {

    logger.info("User {} requested to create new entity", profileProvider.getIfAvailable());

    userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));

    return Optional.ofNullable(userDto)
      .map(userMapper::toEntity)
      .map(userProvider::save)
      .map(userMapper::fromEntity)
      .orElseThrow();
  }

  @Override
  public SimpleUserForUserBooksDto findById(int id) {
    return userMapper.simpleUserForUserBooksDtoFromEntity(userRepository.findById(id).orElse(null));
  }

  @Override
  public PageDto<UserDto> findAll(Integer pageSize, Integer pageNumber) {
    var values = userRepository.findAll(Pageable
      .ofSize(pageSize)
      .withPage(pageNumber)).map(userMapper::fromEntity);
    return ImmutablePageDto.<UserDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
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
    userRepository.deleteById(id);
  }
}
