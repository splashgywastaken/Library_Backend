package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.ReviewEntity;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewEntity, Integer> {
}
