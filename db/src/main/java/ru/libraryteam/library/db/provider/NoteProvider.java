package ru.libraryteam.library.db.provider;

import ru.libraryteam.library.db.entity.NoteEntity;

import java.util.Optional;

public interface NoteProvider {

  NoteEntity save(NoteEntity noteEntity);

  Optional<NoteEntity> findById(int id);

}
