package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.UserDto;
import ru.libraryteam.library.service.mapper.logic.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService service;

  @Autowired
  public UserController(UserService service) {
    this.service = service;
  }


  @RequestMapping
  Iterable<UserDto> getUsers() { return service.findAll(); }

  @RequestMapping("/{id}")
  UserDto getUserById(@PathVariable int id) {
    return service.findById(id);
  }

  @PostMapping
  UserDto createUser(@RequestBody UserDto dto) {
    return service.createUser(dto);
  }

  @PutMapping("/{id}")
  UserDto updateUser(@RequestBody UserDto dto, @PathVariable int id){
    dto.setId(id);
    return service.updateUser(dto);
  }

  @DeleteMapping("/{id}")
  void deleteUser(@PathVariable int id) {
    service.deleteUser(id);
  }
}
