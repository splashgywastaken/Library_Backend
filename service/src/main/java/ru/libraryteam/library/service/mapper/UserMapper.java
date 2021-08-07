package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

import java.util.List;

@Mapper
public interface UserMapper {

  UserDto fromEntity(UserEntity entity);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "role", ignore = true)
  @Mapping(target = "password", ignore = true)
  void toEntity(UserDto dto, @MappingTarget UserEntity original);

  @Mapping(target = "id", ignore = true)
  UserEntity toEntity(UserCreateDto dto);

  List<UserDto> formEntities(Iterable<UserEntity> entities);

  SimpleUserMessageDto fromSimpleEntity(UserEntity entity);

  List<SimpleUserMessageDto> fromSimpleEntities(Iterable<UserEntity> entities);
}
