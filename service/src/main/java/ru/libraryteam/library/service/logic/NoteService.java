package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.model.PageDto;

import java.util.List;

public interface NoteService {

  NoteDto createNote(NoteDto dto);

  List<NoteDto> findByUserId(int userId);

  NoteDto findByComplexId(int userId, int bookId);

  NoteDto findById(int id);

  PageDto<NoteDto> findAll(Integer pageSize, Integer pageNumber);

  NoteDto updateNote(NoteDto dto);

  void deleteNoteByComplexId(int userId, int bookId);

  void deleteNote(int id);

}
