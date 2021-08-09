package ru.libraryteam.library.db.provider;

import ru.libraryteam.library.db.entity.UserEntity;

import java.util.Optional;


public interface UserProvider {

  UserEntity save(UserEntity userEntity);

  Optional<UserEntity> findById(int id);

  Iterable<UserEntity> findAll();

  void deleteById(int id);

  boolean isUsernameExists(String value);

  boolean isUsernameExists(int id, String username);

  boolean isEmailExists(String value);

  boolean isEmailExists(int id, String email);

}
