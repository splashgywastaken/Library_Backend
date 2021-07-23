package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.mapper.dto.BookDto;

import java.util.List;

@Mapper
public interface BookMapper {

  BookDto fromEntity(BookEntity bookEntity);

  BookEntity toEntity(BookDto bookDto);

  List<BookDto> fromEntities(Iterable<BookEntity> bookEntities);
}
