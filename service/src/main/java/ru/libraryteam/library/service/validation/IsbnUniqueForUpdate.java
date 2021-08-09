package ru.libraryteam.library.service.validation;

import org.springframework.beans.factory.annotation.Autowired;
import ru.libraryteam.library.db.provider.BookProvider;
import ru.libraryteam.library.service.model.BookDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsbnUniqueForUpdate implements ConstraintValidator<IsbnUnique, BookDto> {

  private final BookProvider bookProvider;

  @Autowired
  public IsbnUniqueForUpdate(BookProvider bookProvider) {
    this.bookProvider = bookProvider;
  }

  @Override
  public boolean isValid(BookDto value, ConstraintValidatorContext context) {
    if (value == null || value.getId() == null || value.getIsbn() == null) {
      return true;
    }

    return !bookProvider.isIsbnExists(value.getIsbn() ,value.getId());
  }
}
