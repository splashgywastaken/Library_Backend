package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.ReadingListEntity;

@Repository
public interface ReadingListRepository extends CrudRepository<ReadingListEntity, Integer> {

  @Query(
    ""
      + "SELECT r "
      + "FROM reading_lists r "
      + "WHERE r.readingState = 1 "
      + "GROUP BY r.id "
  )
  Page<ReadingListEntity> findAll(Pageable pageable);

  void deleteAllByBookId(int bookId);

  void deleteAllByUserId(int userId);

  ReadingListEntity getByBookIdAndUserId(int bookId, int userId);
}
