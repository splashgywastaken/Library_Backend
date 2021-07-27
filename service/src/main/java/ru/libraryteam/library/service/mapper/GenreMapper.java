package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.GenreEntity;
import ru.libraryteam.library.service.model.GenreDto;

import java.util.List;

@Mapper
public interface GenreMapper {

  GenreDto fromEntity(GenreEntity genreEntity);

  GenreEntity toEntity(GenreDto genreDto);

  List<GenreDto> fromEntities(Iterable<GenreEntity> genreEntities);
}
