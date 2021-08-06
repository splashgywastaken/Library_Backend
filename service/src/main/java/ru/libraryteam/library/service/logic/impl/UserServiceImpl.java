package ru.libraryteam.library.service.logic.impl;

import org.immutables.value.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.logic.UserService;
import ru.libraryteam.library.service.security.LibraryPasswordEncoder;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository repository;
  private final UserMapper userMapper;
  private final LibraryPasswordEncoder passwordEncoder;

  @Autowired
  public UserServiceImpl(UserRepository repository, UserMapper mapper, LibraryPasswordEncoder passwordEncoder) {
    this.repository = repository;
    this.userMapper = mapper;
    this.passwordEncoder = passwordEncoder;
    System.out.println(passwordEncoder.encode("admin"));
  }

  @Override
  public UserDto createUser(UserDto dto) {
    return userMapper.fromEntity(
      repository.save(
        userMapper.toEntity(dto)
      )
    );
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
  public UserDto updateUser(UserDto dto) {
    return createUser(dto);
  }

  @Override
  public void deleteUser(int id) {
    repository.deleteById(id);
  }
}
