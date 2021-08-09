package ru.libraryteam.library.db.provider;

import ru.libraryteam.library.db.entity.ReviewEntity;

import java.util.Optional;

public interface ReviewProvider {
  ReviewEntity save(ReviewEntity entity);

  Optional<ReviewEntity> findById(int id);
}
