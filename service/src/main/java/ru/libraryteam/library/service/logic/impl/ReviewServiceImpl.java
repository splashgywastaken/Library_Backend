package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.ReadingListRepository;
import ru.libraryteam.library.db.repository.ReviewRepository;
import ru.libraryteam.library.service.logic.ReviewService;
import ru.libraryteam.library.service.mapper.ReadingListMapper;
import ru.libraryteam.library.service.mapper.ReviewMapper;
import ru.libraryteam.library.service.model.ReviewDto;

@Service
public class ReviewServiceImpl implements ReviewService {

  private final ReviewRepository reviewRepository;
  private final ReviewMapper reviewMapper;

  private final ReadingListMapper readingListMapper;
  private final ReadingListRepository readingListRepository;

  @Autowired
  public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper, ReadingListMapper readingListMapper, ReadingListRepository readingListRepository) {
    this.reviewRepository = reviewRepository;
    this.reviewMapper = reviewMapper;
    this.readingListMapper = readingListMapper;
    this.readingListRepository = readingListRepository;
  }

  @Override
  public ReviewDto findById(int id) {
    return reviewMapper.fromEntity(
      reviewRepository.findById(id)
        .orElse(null)
    );
  }

  @Override
  @Transactional
  public ReviewDto createReview(ReviewDto dto, int listId) {
    var review = reviewMapper.fromEntity(
      reviewRepository.save(
        reviewMapper.toEntity(dto)
      )
    );

    var list = readingListMapper.fromEntity(
      readingListRepository.findById(listId)
        .orElse(null)
    );

    list.setReviewId(review.getId());

    readingListMapper.fromEntity(
      readingListRepository.save(
        readingListMapper.toEntity(list)
      )
    );

    return review;
  }

  @Override
  public void deleteReview(int id) {
    reviewRepository.deleteById(id);
  }
}
