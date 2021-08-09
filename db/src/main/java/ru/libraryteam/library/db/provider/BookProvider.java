package ru.libraryteam.library.db.provider;

import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;

public interface BookProvider {

  boolean isIsbnExists(String value);

  boolean isIsbnExists(String value, int id);

}
