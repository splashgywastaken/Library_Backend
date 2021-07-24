package ru.libraryteam.library.service.mapper.logic.impl;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.mapper.UserMapper;
import ru.libraryteam.library.service.mapper.dto.UserDto;
import ru.libraryteam.library.service.mapper.logic.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository repository;
  private final UserMapper mapper;

  public UserServiceImpl(UserRepository repository, UserMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public UserDto createUser(UserDto dto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(dto)
      )
    );
  }

  @Override
  public UserDto findById(int id) {
    return mapper.fromEntity(repository.findById(id).orElse(null));
  }

  @Override
  public List<UserDto> findAll() {
    return mapper.formEntities(repository.findAll());
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
