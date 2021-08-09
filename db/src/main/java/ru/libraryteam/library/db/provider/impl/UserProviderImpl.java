package ru.libraryteam.library.db.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.db.repository.UserRepository;

import java.util.Optional;

@Component
public class UserProviderImpl implements UserProvider {

  private final UserRepository userRepository;

  @Autowired
  public UserProviderImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserEntity save(UserEntity userEntity) {
    return userRepository.save(userEntity);
  }

  @Override
  public Optional<UserEntity> findById(int id) {
    return userRepository.findById(id);
  }

  @Override
  public Iterable<UserEntity> findAll() {
    return userRepository.findAll();
  }

  @Override
  public void deleteById(int id) {
    userRepository.deleteById(id);
  }

  @Override
  public boolean isUsernameExists(String value) {
    return userRepository.existsByUsernameIgnoreCase(value);
  }

  @Override
  public boolean isUsernameExists(int id, String username) {
    return userRepository.existsByIdIsNotAndUsernameIgnoreCase(id, username);
  }

  @Override
  public boolean isEmailExists(String value) {
    return  userRepository.existsByEmailIgnoreCase(value);
  }

  @Override
  public boolean isEmailExists(int id, String email) {
    return userRepository.existsByIdIsNotAndEmailIgnoreCase(id, email);
  }
}
