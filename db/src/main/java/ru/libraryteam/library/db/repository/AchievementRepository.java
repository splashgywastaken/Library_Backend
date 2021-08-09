package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.AchievementEntity;

@Repository
public interface AchievementRepository extends CrudRepository<AchievementEntity, Integer> {
}
