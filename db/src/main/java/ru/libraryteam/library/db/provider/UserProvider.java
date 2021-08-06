package ru.libraryteam.library.db.provider;

import ru.libraryteam.library.db.entity.UserEntity;

import java.util.Optional;


public interface UserProvider {

  UserEntity save(UserEntity userEntity);

  Optional<UserEntity> findById(int id);

  Iterable<UserEntity> findAll();

  void deleteById(int id);

}
