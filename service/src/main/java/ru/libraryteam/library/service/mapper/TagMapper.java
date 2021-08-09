package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.TagEntity;
import ru.libraryteam.library.service.model.TagDto;

import java.util.List;

@Mapper
public interface TagMapper {

  TagDto fromEntity(TagEntity entity);

  TagEntity toEntity(TagDto dto);

  List<TagDto> fromEntities(Iterable<TagEntity> entities);
}
