package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.service.model.MessageDto;

import java.util.List;

@Mapper
public interface MessageMapper {

  MessageDto fromEntity(MessageEntity entity);

  List<MessageDto> fromEntities(Iterable<MessageEntity> entities);

  @Mapping(target = "messageTitle", ignore = true)
  @Mapping(target = "messagePostDate", ignore = true)
  MessageEntity toEntity(MessageDto messageDto);
}


