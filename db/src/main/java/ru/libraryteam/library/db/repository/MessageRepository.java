package ru.libraryteam.library.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.complex.id.MessageId;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, MessageId> {

  @Override
  Iterable<MessageEntity> findAll();
}
