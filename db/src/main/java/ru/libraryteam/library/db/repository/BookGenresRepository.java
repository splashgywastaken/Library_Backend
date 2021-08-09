package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookGenresEntity;
import ru.libraryteam.library.db.entity.complex.id.BookGenresId;

@Repository
public interface BookGenresRepository extends CrudRepository<BookGenresEntity, BookGenresId> {

  @Override
  Iterable<BookGenresEntity> findAll();
}
