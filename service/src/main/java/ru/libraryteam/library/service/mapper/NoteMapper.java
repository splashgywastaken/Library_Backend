package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.libraryteam.library.db.entity.NoteEntity;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.model.create.dto.NoteCreateDto;

import java.util.List;

@Mapper
public interface NoteMapper {

  @Mapping(target = "userId", ignore = true)
  @Mapping(target = "bookId", ignore = true)
  void toEntity(NoteDto noteDto, @MappingTarget NoteEntity original);

  NoteDto fromEntity(NoteEntity entity);

  NoteEntity toEntity(NoteCreateDto dto);

  NoteEntity toEntity(NoteDto dto);

  List<NoteDto> fromEntities(Iterable<NoteEntity> noteEntities);

}
