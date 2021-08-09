package ru.libraryteam.library.db.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.ReviewEntity;
import ru.libraryteam.library.db.provider.ReviewProvider;
import ru.libraryteam.library.db.repository.ReviewRepository;

import java.util.Optional;

@Component
public class ReviewProviderImpl implements ReviewProvider {

  private final ReviewRepository reviewRepository;

  @Autowired
  public ReviewProviderImpl(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @Override
  public ReviewEntity save(ReviewEntity entity) {
    return reviewRepository.save(entity);
  }

  @Override
  public Optional<ReviewEntity> findById(int id) {
    return reviewRepository.findById(id);
  }
}
