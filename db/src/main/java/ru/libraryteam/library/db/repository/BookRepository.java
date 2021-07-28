package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>, JpaSpecificationExecutor<BookEntity> {

  Page<BookEntity> getAllByBookNameIsContainingOrAgeRatingIsContaining(
    String bookName, String ageRating, Pageable pageable
  );

}
