package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.MessageEntity;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, Integer> {

  @Override
  Iterable<MessageEntity> findAll();
}
