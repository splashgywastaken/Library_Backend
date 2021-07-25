package ru.libraryteam.library.service.mapper.logic;

import ru.libraryteam.library.service.mapper.dto.NoteDto;

import java.util.List;

public interface NoteService {

  NoteDto createNote(NoteDto dto);

  NoteDto findById(int id);

  List<NoteDto> findAll();

  NoteDto updateNote(NoteDto dto);

  void deleteNote(int id);

}
