package ru.libraryteam.library.service.logic.impl;


import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.NoteRepository;
import ru.libraryteam.library.service.mapper.NoteMapper;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.logic.NoteService;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

  private final NoteRepository repository;
  private final NoteMapper mapper;

  public NoteServiceImpl(NoteRepository repository, NoteMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  //Создание новой заметки
  @Override
  public NoteDto createNote(NoteDto dto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(dto)
      )
    );
  }

  //Получение всех заметок юзера
  @Override
  public List<NoteDto> findByUserId(int userId) {
    return mapper.fromEntities(
      repository.findNoteEntitiesByUserId(userId)
    );
  }

  //Получение заметок юзера по определенной книге
  @Override
  public NoteDto findByComplexId(int userId, int bookId) {
    return mapper.fromEntity(
      repository
        .findNoteEntityByUserIdAndBookId(userId, bookId)
    );
  }

  //Получение заметки по Id
  @Override
  public NoteDto findById(int id) {
    return mapper.fromEntity(
      repository
      .findById(id)
      .orElse(null)
    );
  }

  //Получение всех заметок из бд
  @Override
  public List<NoteDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  //Обновление заметки в бд
  @Override
  public NoteDto updateNote(NoteDto dto) {
    return createNote(dto);
  }

  //Удаление заметки пользователя из бд по айди пользователя и айди книги
  @Override
  public void deleteNoteByComplexId(int userId, int bookId) {
    repository.deleteNoteEntityByUserIdAndBookId(userId, bookId);
  }

  //Удаление заметки из бд по id
  @Override
  public void deleteNote(int id) {
    repository.deleteById(id);
  }
}
