package ru.libraryteam.library.service.validation;

import ru.libraryteam.library.service.validation.validator.StringEmailUnique;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StringEmailUnique.class, EmailUniqueForUpdate.class})
public @interface EmailUnique {
  String message() default "email.already-exists";

  Class<? extends Payload>[] payload() default {};

  Class<?>[] groups() default {};
}
