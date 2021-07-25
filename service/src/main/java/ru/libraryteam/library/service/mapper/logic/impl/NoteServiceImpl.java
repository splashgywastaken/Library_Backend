package ru.libraryteam.library.service.mapper.logic.impl;


import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.NoteRepository;
import ru.libraryteam.library.service.mapper.NoteMapper;
import ru.libraryteam.library.service.mapper.dto.NoteDto;
import ru.libraryteam.library.service.mapper.logic.NoteService;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

  private final NoteRepository repository;
  private final NoteMapper mapper;

  public NoteServiceImpl(NoteRepository repository, NoteMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public NoteDto createNote(NoteDto dto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(dto)
      )
    );
  }

  @Override
  public NoteDto findById(int id) {
    return mapper.fromEntity(
      repository
      .findById(id)
      .orElse(null)
    );
  }

  @Override
  public List<NoteDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  @Override
  public NoteDto updateNote(NoteDto dto) {
    return createNote(dto);
  }

  @Override
  public void deleteNote(int id) {
    repository.deleteById(id);
  }
}
