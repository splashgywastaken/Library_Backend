package ru.libraryteam.library.service.validation;

import ru.libraryteam.library.service.validation.validator.StringIsbnUnique;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StringIsbnUnique.class, IsbnUniqueForUpdate.class})
public @interface IsbnUnique {
  String message() default "isbn.already-exists";

  Class<? extends Payload>[] payload() default {};

  Class<?>[] groups() default {};
}
