package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.create.dto.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.userbooks.SimpleUserForUserBooksDto;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

  UserDto createUser(@Valid UserCreateDto userDto);

  SimpleUserForUserBooksDto findById(int id);

  PageDto<UserDto> findAll(Integer pageSize, Integer pageNumber);

  UserDto updateUser(UserDto dto);

  void deleteUser(int id);
}
