package ru.libraryteam.library.service.logic.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.libraryteam.library.db.provider.NoteProvider;
import ru.libraryteam.library.db.repository.NoteRepository;
import ru.libraryteam.library.service.mapper.NoteMapper;
import ru.libraryteam.library.service.model.ImmutablePageDto;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.logic.NoteService;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.create.dto.NoteCreateDto;
import ru.libraryteam.library.service.security.Profile;

import javax.validation.Valid;
import java.util.List;

@Service
@Validated
public class NoteServiceImpl implements NoteService {

  private final Logger logger = LoggerFactory.getLogger(NoteServiceImpl.class);

  private final NoteRepository noteRepository;
  private final NoteMapper noteMapper;
  private final NoteProvider noteProvider;

  private final ObjectProvider<Profile> profileProvider;

  public NoteServiceImpl(
    NoteRepository noteRepository,
    NoteMapper noteMapper,
    NoteProvider noteProvider,
    ObjectProvider<Profile> profileProvider
    ) {
    this.noteRepository = noteRepository;
    this.noteMapper = noteMapper;
    this.noteProvider = noteProvider;
    this.profileProvider = profileProvider;
  }

  //Создание новой заметки
  @Override
  public NoteDto createNote(@Valid NoteCreateDto dto) {

    logger.info("User {} requested to create new entity", profileProvider.getIfAvailable());

    return noteMapper.fromEntity(
      noteRepository.save(
        noteMapper.toEntity(dto)
      )
    );
  }

  public NoteDto createNote(NoteDto dto) {
    return noteMapper.fromEntity(
      noteRepository.save(
        noteMapper.toEntity(dto)
      )
    );
  }

  //Получение всех заметок юзера
  @Override
  public List<NoteDto> findByUserId(int userId) {
    return noteMapper.fromEntities(
      noteRepository.findNoteEntitiesByUserId(userId)
    );
  }

  //Получение заметок юзера по определенной книге
  @Override
  public NoteDto findByComplexId(int userId, int bookId) {
    return noteMapper.fromEntity(
      noteRepository
        .findNoteEntityByUserIdAndBookId(userId, bookId)
    );
  }

  //Получение заметки по Id
  @Override
  public NoteDto findById(int id) {
    return noteMapper.fromEntity(
      noteRepository
      .findById(id)
      .orElse(null)
    );
  }

  //Получение всех заметок из бд
  @Override
  public PageDto<NoteDto> findAll(Integer pageSize, Integer pageNumber) {
    var values = noteRepository.findAll(Pageable
      .ofSize(pageSize)
      .withPage(pageNumber)).map(noteMapper::fromEntity);
    return ImmutablePageDto.<NoteDto>builder()
      .pageNumber(pageNumber)
      .totalPages(values.getTotalPages())
      .items(values.getContent())
      .build();
  }

  //Обновление заметки в бд
  @Override
  @Transactional
  public NoteDto updateNote(NoteDto dto) {
    return createNote(dto);
  }

  //Удаление заметки пользователя из бд по айди пользователя и айди книги
  @Override
  public void deleteNoteByComplexId(int userId, int bookId) {
    noteRepository.deleteNoteEntityByUserIdAndBookId(userId, bookId);
  }

  //Удаление заметки из бд по id
  @Override
  public void deleteNote(int id) {
    noteRepository.deleteById(id);
  }
}
