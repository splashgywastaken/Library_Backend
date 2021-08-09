package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookTagsEntity;
import ru.libraryteam.library.db.entity.complex.id.BookTagsId;

@Repository
public interface BookTagsRepository extends CrudRepository<BookTagsEntity, BookTagsId> {

  @Override
  Iterable<BookTagsEntity> findAll();
}
