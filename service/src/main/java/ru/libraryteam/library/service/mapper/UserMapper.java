package ru.libraryteam.library.service.mapper;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

import java.util.List;

@Mapper
@JsonPropertyOrder({
  "id",
  "first_name",
  "second_name",
  "middle_name",
  "birthday",
  "sex",
  "username",
  "email",
  "role"
})

public interface UserMapper {

  UserDto fromEntity(UserEntity entity);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "role", ignore = true)
  @Mapping(target = "password", ignore = true)
  void toEntity(UserDto dto, @MappingTarget UserEntity original);

  @Mapping(target = "id", ignore = true)
  UserEntity toEntity(UserCreateDto dto);

  List<UserDto> formEntities(Iterable<UserEntity> entities);

  SimpleUserDto fromSimpleEntity(UserEntity entity);

  List<SimpleUserDto> fromSimpleEntities(Iterable<UserEntity> entities);
}
