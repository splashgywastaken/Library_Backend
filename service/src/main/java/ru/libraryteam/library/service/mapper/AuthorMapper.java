package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.impl.AuthorDtoImpl;

import java.util.List;

@Mapper
public interface AuthorMapper {

  @Mapping(target = "birthday", ignore = true)
  @Mapping(target = "sex", ignore = true)
  @Mapping(target = "middleName", ignore = true)
  @Mapping(target = "pseudonym", ignore = true)
  AuthorEntity toEntity(AuthorDto authorDto);

  AuthorDto fromEntity(AuthorEntity authorEntity);

  List<AuthorDto> fromEntities(Iterable<AuthorEntity> authorEntities);
}
