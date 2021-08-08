package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ru.libraryteam.library.db.entity.ReviewEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.create.dto.ReviewCreateDto;

import java.util.List;

@Mapper
public interface ReviewMapper {

  ReviewEntity toEntity(ReviewDto dto);

  ReviewDto fromEntity(ReviewEntity entity);

  List<ReviewDto> fromEntities(Iterable<ReviewEntity> entities);
}
