package ru.libraryteam.library.service.security;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.UserEntity;

@Mapper
public interface ProfileMapper {
  Profile toProfile(UserEntity userEntity);
}
