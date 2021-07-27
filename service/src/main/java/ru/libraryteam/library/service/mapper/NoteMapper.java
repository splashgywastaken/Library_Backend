package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.NoteEntity;
import ru.libraryteam.library.service.model.NoteDto;

import java.util.List;

@Mapper
public interface NoteMapper {

  NoteDto fromEntity(NoteEntity entity);

  NoteEntity toEntity(NoteDto dto);

  List<NoteDto> fromEntities(Iterable<NoteEntity> noteEntities);

}
