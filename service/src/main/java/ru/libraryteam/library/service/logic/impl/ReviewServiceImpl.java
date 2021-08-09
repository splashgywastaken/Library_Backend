package ru.libraryteam.library.service.logic.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.entity.ReadingState;
import ru.libraryteam.library.db.provider.NoteProvider;
import ru.libraryteam.library.db.provider.ReviewProvider;
import ru.libraryteam.library.db.repository.ReadingListRepository;
import ru.libraryteam.library.db.repository.ReviewRepository;
import ru.libraryteam.library.service.logic.ReviewService;
import ru.libraryteam.library.service.mapper.ReadingListMapper;
import ru.libraryteam.library.service.mapper.ReviewMapper;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.create.dto.ReviewCreateDto;
import ru.libraryteam.library.service.security.Profile;

import javax.validation.Valid;
import java.util.Optional;

@Service
@Validated
public class ReviewServiceImpl implements ReviewService {
  private final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);

  private final ReviewRepository reviewRepository;
  private final ReviewMapper reviewMapper;

  private final ReadingListMapper readingListMapper;
  private final ReadingListRepository readingListRepository;

  private final ReviewProvider reviewProvider;
  private final ObjectProvider<Profile> profileProvider;

  @Autowired
  public ReviewServiceImpl(
    ReviewRepository reviewRepository,
    ReviewMapper reviewMapper,
    ReadingListMapper readingListMapper,
    ReadingListRepository readingListRepository,
    ReviewProvider reviewProvider,
    ObjectProvider<Profile> profileProvider) {
    this.reviewRepository = reviewRepository;
    this.reviewMapper = reviewMapper;
    this.readingListMapper = readingListMapper;
    this.readingListRepository = readingListRepository;
    this.reviewProvider = reviewProvider;
    this.profileProvider = profileProvider;
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
  public ReviewDto createReview(@Valid ReviewCreateDto dto, int listId) {
    logger.info("User {} requested to create new entity", profileProvider.getIfAvailable());

    var list = readingListMapper.fromEntity(
      readingListRepository.findById(listId)
        .orElse(null)
    );

    if (list.getReadingState() == ReadingState.I_FINISHED_READING && list.getReviewId() == null) {
      var review = reviewMapper.fromEntity(
        reviewRepository.save(
          reviewMapper.toEntity(dto)
        )
      );

      list.setReviewId(review.getId());

      readingListMapper.fromEntity(
        readingListRepository.save(
          readingListMapper.toEntity(list)
        )
      );

      return review;
    }

    return null;
  }

  @Override
  public void deleteReview(int id) {
    reviewRepository.deleteById(id);
  }
}
