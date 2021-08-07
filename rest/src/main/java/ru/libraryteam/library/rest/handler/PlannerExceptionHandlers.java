package ru.libraryteam.library.rest.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.libraryteam.library.rest.model.ErrorModel;
import ru.libraryteam.library.rest.model.ValidationError;
import ru.libraryteam.library.service.EntityNotFoundException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

@ControllerAdvice
public class PlannerExceptionHandlers {
  private static final org.slf4j.Logger logger =
    org.slf4j.LoggerFactory.getLogger(PlannerExceptionHandlers.class);

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<ErrorModel> handleCvl(ConstraintViolationException e) {
    var errors = e.getConstraintViolations().stream()
      .map(ConstraintViolation::getMessage)
      .map(ValidationError::new)
      .collect(Collectors.toUnmodifiableList());

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorModel(errors));

  }

  @ExceptionHandler(EntityNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public void handEnf(EntityNotFoundException e) {
    logger.error("Failed to find entity in DB", e);
  }
}
