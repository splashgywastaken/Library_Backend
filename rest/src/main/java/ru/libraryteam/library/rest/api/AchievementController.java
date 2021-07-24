package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.mapper.dto.AchievementDto;
import ru.libraryteam.library.service.mapper.logic.AchievementService;

@RestController
@RequestMapping("/achievements")
public class AchievementController {

  private final AchievementService service;

  @Autowired
  public AchievementController(AchievementService service) {
    this.service = service;
  }


  @RequestMapping
  Iterable<AchievementDto> getAchievements() { return service.findAll(); }

  @RequestMapping("/{id}")
  AchievementDto getAchievementById(@PathVariable int id) { return service.findById(id); }

  @PostMapping
  AchievementDto createAchievement(@RequestBody AchievementDto achievementDto) {
    return service.createAchievement(achievementDto);
  }

  @PutMapping("/{id}")
  AchievementDto updateAchievement(@RequestBody AchievementDto achievement, @PathVariable int id) {
        achievement.setId(id);
        return service.updateAchievement(achievement);
  }

  @DeleteMapping("/{id}")
  void deleteAchievement(@PathVariable int id) {
    service.deleteAchievement(id);
  }

}
