package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.db.entity.BookEntity;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>, JpaSpecificationExecutor<BookEntity> {

  @Query(
    ""
      + "SELECT b "
      + "FROM books b "
      + "LEFT JOIN b.authors a "
      + "LEFT JOIN b.genres g "
      + "LEFT JOIN b.tags t "
      + "WHERE "
      + "LOWER(a.lastName) IN ?1 "
      + "OR LOWER(a.firstName) IN ?2 "
      + "OR LOWER(g.genreName) IN ?3 "
      + "OR LOWER(t.tagName) IN ?4 "
      + "OR LOWER(b.bookName) LIKE CONCAT('%', LOWER(?5), '%') "
      + "OR b.yearOfPublishing = ?6 "
      + "OR b.isbn = ?7 "
      + "OR b.ageRating = ?8 "
      + "GROUP BY b.id "
  )
  Page<BookEntity> findBooks(
    List<String> authorLastName,
    List<String> authorFirstName,
    List<String> genreName,
    List<String> tagName,
    String bookName,
    Integer yearOfPublishing,
    String isbn,
    String ageRating,
    Pageable pageable
  );


  @Override
  @EntityGraph(value = "book-with-authors-genres")
  Iterable<BookEntity> findAll();
}
