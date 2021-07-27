package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.UserDto;

import java.util.List;

public interface UserService {

  UserDto createUser(UserDto dto);

  UserDto findById(int id);

  List<UserDto> findAll();

  UserDto updateUser(UserDto dto);

  void deleteUser(int id);
}
