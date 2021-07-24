package ru.libraryteam.library.service.mapper.logic;

import ru.libraryteam.library.service.mapper.dto.AchievementDto;

import java.util.List;

public interface AchievementService {

  AchievementDto createAchievement(AchievementDto achievementDto);

  AchievementDto findById(int id);

  List<AchievementDto> findAll();

  AchievementDto updateAchievement(AchievementDto achievementDto);

  void deleteAchievement(int id);

}
