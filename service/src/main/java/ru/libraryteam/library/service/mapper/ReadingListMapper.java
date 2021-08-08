package ru.libraryteam.library.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.libraryteam.library.db.entity.GenreEntity;
import ru.libraryteam.library.db.entity.ReadingListEntity;
import ru.libraryteam.library.service.model.GenreDto;
import ru.libraryteam.library.service.model.ReadingListDto;
import ru.libraryteam.library.service.model.ReadingListWithBookReviewDto;

import java.util.List;

@Mapper(uses = {BookMapper.class, ReviewMapper.class})
public interface ReadingListMapper {

  @Named("with-book-review")
  ReadingListWithBookReviewDto fromEntityWithBookReview(ReadingListEntity entity);

  @IterableMapping(qualifiedByName = "with-book-review")
  List<ReadingListWithBookReviewDto> fromEntitiesWithBookReview(Iterable<ReadingListEntity> entities);

  @Mapping(target = "review", ignore = true)
  @Mapping(target = "book", ignore = true)
  ReadingListEntity toEntity(ReadingListDto dto);

  ReadingListDto fromEntity(ReadingListEntity entity);

  List<ReadingListDto> fromEntities(Iterable<ReadingListEntity> entities);
}
