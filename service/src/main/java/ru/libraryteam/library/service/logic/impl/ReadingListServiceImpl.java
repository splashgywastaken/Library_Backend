package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.entity.ReadingState;
import ru.libraryteam.library.db.repository.ReadingListRepository;
import ru.libraryteam.library.service.logic.ReadingListService;
import ru.libraryteam.library.service.mapper.ReadingListMapper;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.ReadingListDto;
import ru.libraryteam.library.service.model.ReadingListWithBookReviewDto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

@Service
public class ReadingListServiceImpl implements ReadingListService {

  private final ReadingListMapper readingListMapper;
  private final ReadingListRepository readingListRepository;

  @Autowired
  public ReadingListServiceImpl(ReadingListMapper readingListMapper, ReadingListRepository readingListRepository) {
    this.readingListMapper = readingListMapper;
    this.readingListRepository = readingListRepository;
  }

  @Override
  @Transactional
  public ReadingListWithBookReviewDto findById(int bookId, int userId) {
    var list = readingListMapper.fromEntityWithBookReview(
      readingListRepository.getByBookIdAndUserId(bookId, userId)
    );

    if (list.getDaysLeft()!=null) {
      if (list.getDaysLeft() >= 0) {

        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = list.getReadingFinishedAt().toLocalDateTime().toLocalDate();

        Period period = Period.between(currentDate, endDate);

        list.setDaysLeft(period.getDays());

      } else if (list.getReadingState() != ReadingState.I_FINISHED_READING){
        list.setReadingState(ReadingState.I_HAVE_NOT_RETURNED_THE_BOOK);
      }
    }

    createReadingList(list);

    return list;
  }

  @Override
  public ReadingListDto createReadingList(ReadingListDto dto) {
    return readingListMapper.fromEntity(
      readingListRepository.save(
        readingListMapper.toEntity(dto)
      )
    );
  }

  @Override
  public ReadingListDto acceptSubscription(ReadingListDto dto) {
    LocalDate localDate = LocalDate.now();
    LocalDate plusLocalDate = localDate.plusWeeks(3);

    Timestamp start = Timestamp.valueOf(localDate.atStartOfDay());
    Timestamp end = Timestamp.valueOf(plusLocalDate.atStartOfDay());

    Period period = Period.between(localDate, plusLocalDate);

    Integer daysLeft = period.getDays();

    dto.setReadingStartedAt(start);
    dto.setReadingFinishedAt(end);
    dto.setDaysLeft(daysLeft);

    return createReadingList(dto);
  }

  @Override
  public ReadingListDto userFinishedReading(ReadingListDto dto) {
    LocalDate localDate = LocalDate.now();

    Timestamp end = Timestamp.valueOf(localDate.atStartOfDay());

    Integer daysLeft = 0;

    dto.setReadingFinishedAt(end);
    dto.setDaysLeft(daysLeft);

    return createReadingList(dto);
  }

  @Override
  public void deleteList(int id) {
    readingListRepository.deleteById(id);
  }

  @Override
  @Transactional
  public PageDto<ReadingListWithBookReviewDto> findAll(Integer pageSize, Integer pageNumber) {
    var values = readingListRepository.findAll(
      Pageable
        .ofSize(pageSize)
        .withPage(pageNumber)).map(readingListMapper::fromEntityWithBookReview);
    return ImmutablePageDto.<ReadingListWithBookReviewDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
  }
}
