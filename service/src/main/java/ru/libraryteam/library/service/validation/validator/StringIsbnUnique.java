package ru.libraryteam.library.service.validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ru.libraryteam.library.db.provider.BookProvider;
import ru.libraryteam.library.service.validation.IsbnUnique;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringIsbnUnique implements ConstraintValidator<IsbnUnique, String> {
  private final BookProvider bookProvider;

  @Autowired
  public StringIsbnUnique(BookProvider bookProvider) {
    this.bookProvider = bookProvider;
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null){
      return true;
    }

    return !bookProvider.isIsbnExists(value);
  }


}
