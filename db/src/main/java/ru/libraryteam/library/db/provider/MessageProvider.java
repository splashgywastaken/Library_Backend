package ru.libraryteam.library.db.provider;

import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.NoteEntity;

import java.util.Optional;

public interface MessageProvider {

  MessageEntity save(MessageEntity entity);

  Optional<MessageEntity> findById(int id);
}
