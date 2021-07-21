package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.entity.AchievementEntity;
import ru.libraryteam.library.db.repository.AchievementRepository;

import java.util.Optional;

@RestController
@RequestMapping("/achievement")
public class AchievementController {

  private final AchievementRepository achievementRepository;

  @Autowired
  public AchievementController(AchievementRepository achievementRepository) { this.achievementRepository = achievementRepository; }

  @RequestMapping
  Iterable<AchievementEntity> getAchievements() { return achievementRepository.findAll(); }

  @RequestMapping("/{id}")
  Optional<AchievementEntity> getAchievementById(@PathVariable int id) { return achievementRepository.findById(id); }

  @PostMapping()
  AchievementEntity createAchievement(@RequestBody AchievementEntity achievementEntity) { return achievementRepository.save(achievementEntity); }

  @PutMapping("/{id}")
  AchievementEntity updateAchievement(@RequestBody AchievementEntity achievement, @PathVariable int id) {
        achievement.setId(id);
        return achievementRepository.save(achievement);
  }

  @DeleteMapping("/{id}")
  void deleteAchievement(@PathVariable int id) { achievementRepository.deleteById(id);}

}
