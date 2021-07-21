package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.db.repository.UserRepository;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserRepository userRepository;

  @Autowired
  public UserController(UserRepository userRepository) { this.userRepository = userRepository; }

  @RequestMapping
  Iterable<UserEntity> getUsers() { return userRepository.findAll(); }

  @RequestMapping("/{id}")
  Optional<UserEntity> getUserById(@PathVariable int id) {
    return userRepository.findById(id);
  }

  @PostMapping()
  UserEntity createUser(@RequestBody UserEntity user) {
    return userRepository.save(user);
  }

  @PutMapping("/{id}")
  UserEntity updateUser(@RequestBody UserEntity user, @PathVariable int id){
    user.setId(id);
    return userRepository.save(user);
  }

  @DeleteMapping("/{id}")
  void deleteUser(@PathVariable int id) {
    userRepository.deleteById(id);
  }

}
