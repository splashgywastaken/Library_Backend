package ru.libraryteam.library.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.AuthorWithBooksDto;

import java.util.List;

@Mapper(uses = BookMapper.class)
public interface AuthorMapper {

  AuthorDto fromEntity(AuthorEntity authorEntity);

  @Named("with-books")
  AuthorWithBooksDto fromEntityWithBooks(AuthorEntity author);

  @IterableMapping(qualifiedByName = "with-books")
  List<AuthorWithBooksDto> fromEntitiesWithBooks(Iterable<AuthorEntity> authors);

  @Mapping(target = "birthday", ignore = true)
  @Mapping(target = "sex", ignore = true)
  AuthorEntity toEntity(AuthorDto authorDto);

  List<AuthorDto> fromEntities(Iterable<AuthorEntity> authorEntities);
}
