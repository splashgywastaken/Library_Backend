package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.libraryteam.library.db.entity.BookGenresEntity;
import ru.libraryteam.library.db.entity.complex.id.BookGenresId;

public interface BookGenresRepository extends CrudRepository<BookGenresEntity, BookGenresId> {

  @Override
  Iterable<BookGenresEntity> findAll();
}
