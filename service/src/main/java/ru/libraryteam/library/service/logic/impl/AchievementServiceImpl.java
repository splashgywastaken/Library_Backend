package ru.libraryteam.library.service.logic.impl;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.AchievementRepository;
import ru.libraryteam.library.service.model.AchievementDto;
import ru.libraryteam.library.service.mapper.AchievementMapper;
import ru.libraryteam.library.service.logic.AchievementService;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {

  private final AchievementRepository achievementRepository;
  private final AchievementMapper achievementMapper;

  public AchievementServiceImpl(AchievementRepository achievementRepository, AchievementMapper achievementMapper) {
    this.achievementRepository = achievementRepository;
    this.achievementMapper = achievementMapper;
  }

  @Override
  public AchievementDto createAchievement(AchievementDto achievementDto) {
    return achievementMapper.fromEntity(
      achievementRepository.save(
        achievementMapper.toEntity(achievementDto)
      )
    );
  }

  @Override
  public AchievementDto findById(int id) {
    return achievementMapper.fromEntity(achievementRepository.findById(id).orElse(null));
  }

  @Override
  public List<AchievementDto> findAll() {
    return achievementMapper.fromEntities(achievementRepository.findAll());
  }

  @Override
  public AchievementDto updateAchievement(AchievementDto achievementDto) {
    return createAchievement(achievementDto);
  }

  @Override
  public void deleteAchievement(int id) {
    achievementRepository.deleteById(id);
  }
}
