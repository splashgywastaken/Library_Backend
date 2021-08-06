package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.UserService;
import ru.libraryteam.library.service.model.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService service;

  @Autowired
  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping
//  @Secured(
//    "ADMIN"
//  )
  Iterable<UserDto> findAll(){
    return service.findAll();
  }

  //Получение информации о пользователе по id
  @RequestMapping("/{id}")
//  @Secured(
//    "ADMIN"
//  )
  UserDto getUserById(@PathVariable int id) {
    return service.findById(id);
  }


  //Поиск юзера по имени, фамилии, отчеству (возврат книг через библиотекаря)



  //Создание новой записи с инфой о юзере
  @PostMapping
  @Secured("ADMIN")
  UserDto createUser(@RequestBody UserDto dto) {
    return service.createUser(dto);
  }


  //Апдейт по айдишнику
  @PutMapping("/{id}")
  UserDto updateUser(@RequestBody UserDto dto, @PathVariable int id){
    dto.setId(id);
    return service.updateUser(dto);
  }


  //Удаление по айдишнику
  @DeleteMapping("/{id}")
  void deleteUser(@PathVariable int id) {
    service.deleteUser(id);
  }
}
