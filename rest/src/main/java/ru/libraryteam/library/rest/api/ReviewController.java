package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.ReviewService;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.impl.ReviewDtoImpl;

@RestController
@RequestMapping("/lists/reviews")
public class ReviewController {

  private final ReviewService reviewService;

  @Autowired
  public ReviewController(ReviewService reviewService) {
    this.reviewService = reviewService;
  }

  @GetMapping(value = "/{id}")
  ReviewDto findReviewById(@PathVariable(value = "id") int id) {
    return reviewService.findById(id);
  }

  @PostMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  ReviewDto createReview(@RequestBody ReviewDto dto, @PathVariable(value = "id") int listId) {
    return reviewService.createReview(dto, listId);
  }

  @DeleteMapping("/{id}")
  void deleteReview(@PathVariable(value = "id") int id) { reviewService.deleteReview(id); }
}
