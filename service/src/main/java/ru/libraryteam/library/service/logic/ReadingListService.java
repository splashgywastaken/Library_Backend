package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.ReadingListDto;

public interface ReadingListService {

  ReadingListDto findById(int id);

  ReadingListDto createReadingList(ReadingListDto dto);

  ReadingListDto acceptSubscription(ReadingListDto dto);

  ReadingListDto userFinishedReading(ReadingListDto dto);

  void deleteList(int id);

  PageDto<ReadingListDto> findAll(Integer pageSize, Integer pageNumber);
}
