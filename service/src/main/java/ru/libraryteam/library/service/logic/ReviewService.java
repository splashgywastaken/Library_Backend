package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.ReviewDto;

public interface ReviewService {

  ReviewDto findById(int id);

  ReviewDto createReview(ReviewDto dto, int listId);

  void deleteReview(int id);
}
