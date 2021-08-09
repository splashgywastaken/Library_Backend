package ru.libraryteam.library.service.validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.service.validation.UsernameUnique;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringUsernameUnique implements ConstraintValidator<UsernameUnique, String> {
  private final UserProvider userProvider;

  @Autowired
  public StringUsernameUnique(UserProvider userProvider) {
    this.userProvider = userProvider;
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null){
      return true;
    }

    return !userProvider.isUsernameExists(value);
  }
}
