package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.UserDto;

import java.util.List;

@Mapper
public interface UserMapper {

  UserDto fromEntity(UserEntity entity);

  @Mapping(target = "password", ignore = true)
  @Mapping(target = "achievementId", ignore = true)
  UserEntity toEntity(UserDto dto);

  List<UserDto> formEntities(Iterable<UserEntity> entities);
}
