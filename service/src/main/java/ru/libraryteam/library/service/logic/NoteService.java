package ru.libraryteam.library.service.logic;

import ru.libraryteam.library.service.model.NoteDto;

import java.util.List;

public interface NoteService {

  NoteDto createNote(NoteDto dto);

  NoteDto findById(int id);

  List<NoteDto> findAll();

  NoteDto updateNote(NoteDto dto);

  void deleteNote(int id);

}
