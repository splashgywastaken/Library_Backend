package ru.libraryteam.library.service.mapper.logic.impl;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.AchievementRepository;
import ru.libraryteam.library.service.mapper.AchievementMapper;
import ru.libraryteam.library.service.mapper.dto.AchievementDto;
import ru.libraryteam.library.service.mapper.logic.AchievementService;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {

  private final AchievementRepository repository;
  private final AchievementMapper mapper;

  public AchievementServiceImpl(AchievementRepository repository, AchievementMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public AchievementDto createAchievement(AchievementDto achievementDto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(achievementDto)
      )
    );
  }

  @Override
  public AchievementDto findById(int id) {
    return mapper.fromEntity(repository.findById(id).orElse(null));
  }

  @Override
  public List<AchievementDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  @Override
  public AchievementDto updateAchievement(AchievementDto achievementDto) {
    return createAchievement(achievementDto);
  }

  @Override
  public void deleteAchievement(int id) {
    repository.deleteById(id);
  }
}
