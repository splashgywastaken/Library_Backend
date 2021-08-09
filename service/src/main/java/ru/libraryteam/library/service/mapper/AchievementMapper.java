package ru.libraryteam.library.service.mapper;

import org.mapstruct.Mapper;
import ru.libraryteam.library.db.entity.AchievementEntity;
import ru.libraryteam.library.service.model.AchievementDto;

import java.util.List;

@Mapper
public interface AchievementMapper {

  AchievementDto fromEntity(AchievementEntity achievementEntity);

  AchievementEntity toEntity(AchievementDto achievementDto);

  List<AchievementDto> fromEntities(Iterable<AchievementEntity> achievementEntities);

}
