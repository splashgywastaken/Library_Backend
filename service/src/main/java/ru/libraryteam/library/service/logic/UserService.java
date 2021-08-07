package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

  UserDto createUser(@Valid UserCreateDto userDto);

  UserDto findById(int id);

  List<UserDto> findAll();

  UserDto updateUser(UserDto dto);

  void deleteUser(int id);
}
