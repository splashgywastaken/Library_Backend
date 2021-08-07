package ru.libraryteam.library.service.validation;

import ru.libraryteam.library.service.validation.validator.StringUsernameUnique;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StringUsernameUnique.class, UsernameUniqueForUpdate.class})
public @interface UsernameUnique {
  String message() default "username.already-exists";

  Class<? extends Payload>[] payload() default {};

  Class<?>[] groups() default {};
}
