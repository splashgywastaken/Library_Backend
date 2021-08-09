package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.ReadingListDto;
import ru.libraryteam.library.service.model.ReadingListWithBookReviewDto;

public interface ReadingListService {

  ReadingListWithBookReviewDto findById(int bookId, int userId);

  ReadingListDto createReadingList(ReadingListDto dto);

  ReadingListDto acceptSubscription(ReadingListDto dto);

  ReadingListDto userFinishedReading(ReadingListDto dto);

  void deleteList(int id);

  PageDto<ReadingListWithBookReviewDto> findAll(Integer pageSize, Integer pageNumber);
}
