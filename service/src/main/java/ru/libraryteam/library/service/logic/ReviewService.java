package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.create.dto.ReviewCreateDto;

import javax.validation.Valid;

public interface ReviewService {

  ReviewDto findById(int id);

  ReviewDto createReview(@Valid ReviewCreateDto dto, int listId);

  void deleteReview(int id);
}
