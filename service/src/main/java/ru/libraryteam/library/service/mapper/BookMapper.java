package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;

import java.util.List;

@Mapper
public interface BookMapper {

  BookDto fromEntity(BookEntity bookEntity);

  @Mapping(target = "authors", ignore = true)
  BookEntity toEntity(BookDto bookDto);

  List<BookDto> fromEntities(Iterable<BookEntity> bookEntities);
}
