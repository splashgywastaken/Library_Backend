package ru.libraryteam.library.db.entity;

import java.util.Optional;

public enum ReadingState {

  I_WANT_TO_READ(1),
  I_AM_READING_NOW(2),
  I_FINISHED_READING(3),
  I_HAVE_NOT_RETURNED_THE_BOOK(4);

  private final int id;

  ReadingState(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public static Optional<ReadingState> fromId(Integer id) {
    if (id == null) {
      return Optional.empty();
    }

    for (var value: ReadingState.values()) {
      if (value.id == id) {
        return Optional.of(value);
      }
    }
    return Optional.empty();
  }
}
