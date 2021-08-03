package ru.libraryteam.library.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.complex.dto.BookWithAuthorsGenresDto;

import java.util.List;

@Mapper(uses = {AuthorMapper.class, GenreMapper.class})
public interface BookMapper {

  @Named("with-authors-genres")
  BookWithAuthorsGenresDto fromEntityWithAuthorsGenres(BookEntity book);

  @IterableMapping(qualifiedByName = "with-authors-genres")
  List<BookWithAuthorsGenresDto> fromEntitiesWithAuthorsGenres(Iterable<BookEntity> books);

  BookDto fromEntity(BookEntity bookEntity);
}
