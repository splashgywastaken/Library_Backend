package ru.libraryteam.library.service.mapper;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mapstruct.*;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;
import ru.libraryteam.library.service.model.simple.dto.userbooks.SimpleUserForUserBooksDto;

import java.util.List;

@Mapper(uses = {ReadingListMapper.class})
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

  List<UserDto> formEntities(Iterable<UserEntity> entities);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "role", ignore = true)
  @Mapping(target = "password", ignore = true)
  void toEntity(UserDto dto, @MappingTarget UserEntity original);

  @Mapping(target = "id", ignore = true)
  UserEntity toEntity(UserCreateDto dto);

  @Named("simple-user")
  SimpleUserDto fromSimpleEntity(UserEntity entity);

  @IterableMapping(qualifiedByName = "simple-user")
  List<SimpleUserDto> fromSimpleEntities(Iterable<UserEntity> entities);

  SimpleUserForUserBooksDto simpleUserForUserBooksDtoFromEntity(UserEntity entity);

  List<SimpleUserForUserBooksDto> simpleUserForUserBooksDtoFromEntities(Iterable<UserEntity> entities);
}
