package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>, JpaSpecificationExecutor<BookEntity> {

  Page<BookEntity> getAllByBookNameIsContainingOrAgeRatingIsContaining(
    String bookName, String ageRating, Pageable pageable
  );

  @Query(
    ""
      + "SELECT b "
      + "FROM books b "
      + "LEFT JOIN b.authors a "
      + "LEFT JOIN b.genres g "
      + "LEFT JOIN b.tags t "
      + "WHERE (LOWER(a.lastName) LIKE CONCAT('%', LOWER(?1), '%') "
      + "OR LOWER(a.firstName) LIKE CONCAT('%', LOWER(?2), '%')) "
      + "AND LOWER(g.genreName) LIKE CONCAT('%', LOWER(?3), '%') "
      + "AND LOWER(t.tagName) LIKE CONCAT('%', LOWER(?4), '%') "
  )
  Page<BookEntity> findBooks(
    String authorLastName,
    String authorFirstName,
    String genreName,
    String tagName,
    Pageable pageable
  );

}
