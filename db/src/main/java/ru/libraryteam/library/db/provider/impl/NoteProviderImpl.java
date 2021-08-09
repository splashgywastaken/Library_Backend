package ru.libraryteam.library.db.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.NoteEntity;
import ru.libraryteam.library.db.provider.NoteProvider;
import ru.libraryteam.library.db.repository.NoteRepository;

import java.util.Optional;

@Component
public class NoteProviderImpl implements NoteProvider {

  private final NoteRepository noteRepository;

  @Autowired
  public NoteProviderImpl(NoteRepository noteRepository) {
    this.noteRepository = noteRepository;
  }

  @Override
  public Optional<NoteEntity> findById(int id) {
    return noteRepository.findById(id);
  }

  @Override
  public NoteEntity save(NoteEntity noteEntity) {
    return noteRepository.save(noteEntity);
  }
}
