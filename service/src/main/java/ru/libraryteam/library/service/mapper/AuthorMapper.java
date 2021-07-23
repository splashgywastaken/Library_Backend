package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.mapper.dto.AuthorDto;

import java.util.List;

@Mapper
public interface AuthorMapper {

  AuthorDto fromEntity(AuthorEntity authorEntity);

  AuthorEntity toEntity(AuthorDto authorDto);

  List<AuthorDto> fromEntities(Iterable<AuthorEntity> authorEntities);
}
