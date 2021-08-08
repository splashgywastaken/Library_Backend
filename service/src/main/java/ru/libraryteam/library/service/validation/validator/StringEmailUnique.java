package ru.libraryteam.library.service.validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ru.libraryteam.library.db.provider.UserProvider;
import ru.libraryteam.library.service.validation.EmailUnique;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringEmailUnique implements ConstraintValidator<EmailUnique, String> {
  private final UserProvider userProvider;

  @Autowired
  public StringEmailUnique(UserProvider userProvider){
    this.userProvider = userProvider;
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null){
      return true;
    }

    return !userProvider.isEmailExists(value);
  }
}
