package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookAuthorsEntity;
import ru.libraryteam.library.db.entity.complex.id.BookAuthorsId;

@Repository
public interface BookAuthorsRepository extends CrudRepository<BookAuthorsEntity, BookAuthorsId> {

  @Override
  Iterable<BookAuthorsEntity> findAll();

}
