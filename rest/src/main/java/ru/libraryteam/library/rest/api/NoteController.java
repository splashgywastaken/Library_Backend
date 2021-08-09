package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.logic.NoteService;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.create.dto.NoteCreateDto;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

  private final NoteService service;

  @Autowired
  public NoteController(NoteService service) { this.service = service; }

  //Создание заметки
  @PostMapping()
  NoteDto createNote(
    @RequestBody NoteCreateDto noteDto
  ){
    return
      service.createNote(
        noteDto
      );
  }

  //Обновление заметок по их id
  @PutMapping("/{id}")
  NoteDto updateNote(
    @RequestBody NoteDto noteDto,
    @PathVariable(value = "id") int id
    ) {

    noteDto.setNoteId(id);

    return
      service.updateNote(noteDto);
  }

  //Вывод всех заметок
  @GetMapping
  PageDto<NoteDto> getAllNoteEntities(
    @RequestParam(name = "page_size", defaultValue = "10") Integer pageSize,
    @RequestParam(name = "page_number", defaultValue = "0") Integer pageNumber
  ) {
    return
      service.findAll(pageSize, pageNumber);
  }

  //Вывод всех заметок юзера
  @GetMapping("/user/{user_id}")
  List<NoteDto> getNoteEntityByUserId(
    @PathVariable("user_id") int userId
  ) {
    return
      service.findByUserId(userId);
  }

  //Вывод заметки по её айди
  @GetMapping("/{note_id}")
  NoteDto getNoteEntityByNoteId(
    @PathVariable("note_id") int noteId
  ) {
    return
      service.findById(noteId);
  }

  //Вывод заметки по айди книги и айди юзера
  @GetMapping("/user/{user_id}/book/{book_id}")
  NoteDto getNoteByComplexId(
    @PathVariable("user_id") int userId,
    @PathVariable("book_id") int bookId
  ) {
    return
      service.findByComplexId(userId, bookId);
  }

  //Удаление заметки по её айдишнику
  @DeleteMapping("/{note_id}")
  void deleteNote(
    @PathVariable("note_id") int id
  ) {
    service.deleteNote(id);
  }

  //Удаление заметки по айдишнику книги и юзера
  @DeleteMapping("/user/{user_id}/book/{book_id}")
  void deleteNoteByComplexId(
    @PathVariable("user_id") int userId,
    @PathVariable("book_id") int bookId
  ) {
      service.deleteNoteByComplexId(userId, bookId);
  }

}
