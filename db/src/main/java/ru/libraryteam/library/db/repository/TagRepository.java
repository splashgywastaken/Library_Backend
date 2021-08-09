package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.TagEntity;

@Repository
public interface TagRepository extends CrudRepository<TagEntity, Integer> {

  TagEntity getByTagNameEquals(String tagName);
}
