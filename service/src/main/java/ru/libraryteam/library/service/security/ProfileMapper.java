package ru.libraryteam.library.service.security;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.UserEntity;

@Mapper
@JsonPropertyOrder({
  "id",
  "first_name",
  "second_name",
  "middle_name",
  "sex",
  "username",
  "email",
  "role"
})

public interface ProfileMapper {
  Profile toProfile(UserEntity userEntity);
}
