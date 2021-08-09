package ru.libraryteam.library.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.BookWithAuthorsGenresTagsDto;
import ru.libraryteam.library.service.model.create.dto.BookCreateDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookWithAuthorsGenresDto;

import java.util.List;

@Mapper(uses = {AuthorMapper.class, GenreMapper.class, TagMapper.class, MessageMapper.class, UserMapper.class})
public interface BookMapper {

  @Named("with-authors-genres-tags")
  BookWithAuthorsGenresTagsDto fromEntityWithAuthorsGenresTags(BookEntity book);

  @IterableMapping(qualifiedByName = "with-authors-genres-tags")
  List<BookWithAuthorsGenresTagsDto> fromEntitiesWithAuthorsGenresTags(Iterable<BookEntity> books);

  @Named("with-authors-genres")
  SimpleBookWithAuthorsGenresDto fromEntityWithAuthorsGenres(BookEntity book);

  @IterableMapping(qualifiedByName = "with-authors-genres")
  List<SimpleBookWithAuthorsGenresDto> fromEntitiesWithAuthorsGenres(Iterable<BookEntity> books);

  BookDto fromEntity(BookEntity bookEntity);

  @Mapping(target ="authors", ignore = true)
  @Mapping(target = "genres", ignore = true)
  @Mapping(target = "tags", ignore = true)
  @Mapping(target = "messages", ignore = true)
  BookEntity toEntity(BookDto dto);

  @Mapping(target ="authors", ignore = true)
  @Mapping(target = "genres", ignore = true)
  @Mapping(target = "tags", ignore = true)
  @Mapping(target = "messages", ignore = true)
  BookEntity toEntity(BookCreateDto dto);
}
