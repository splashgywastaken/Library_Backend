package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.ReviewEntity;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.create.dto.MessageCreateDto;
import ru.libraryteam.library.service.model.create.dto.ReviewCreateDto;

import java.util.List;

@Mapper
public interface MessageMapper {

  MessageDto fromEntity(MessageEntity entity);

  List<MessageDto> fromEntities(Iterable<MessageEntity> entities);

  @Mapping(target = "messageTitle", ignore = true)
  @Mapping(target = "messagePostDate", ignore = true)
  void toEntity(MessageDto dto, @MappingTarget MessageEntity original);

  MessageEntity toEntity(MessageCreateDto dto);
}


