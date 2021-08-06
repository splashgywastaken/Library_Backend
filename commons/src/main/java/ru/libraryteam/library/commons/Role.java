package ru.libraryteam.library.commons;

import java.util.Locale;
import java.util.Optional;

public enum Role {

  ADMIN(1),
  LIBRARIAN(2),
  USER(3);

  private final int id;

  Role(int id) {
    this.id = id;
  }

  public static Optional<Role> of(Integer id) {
    if (id == null) {
      return Optional.empty();
    }

    for (var value : Role.values()) {
      if (value.id == id)
        return Optional.of(value);
    }

    return Optional.empty();
  }

  public int getId(){
    return
      this.id;
  }

}
