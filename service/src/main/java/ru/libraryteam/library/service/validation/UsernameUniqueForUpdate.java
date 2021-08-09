package ru.libraryteam.library.service.validation;

import org.springframework.beans.factory.annotation.Autowired;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.service.model.UserDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameUniqueForUpdate implements ConstraintValidator<UsernameUnique, UserDto> {

  private final UserProvider provider;

  @Autowired
  public UsernameUniqueForUpdate(UserProvider provider) {
    this.provider = provider;
  }

  @Override
  public boolean isValid(UserDto value, ConstraintValidatorContext context) {
    if (value == null || value.getId() == null || value.getUsername() == null) {
      return true;
    }

    return !provider.isUsernameExists(value.getId(), value.getUsername());
  }
}
