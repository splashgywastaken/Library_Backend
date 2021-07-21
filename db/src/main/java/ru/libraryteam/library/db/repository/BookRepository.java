package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
}
