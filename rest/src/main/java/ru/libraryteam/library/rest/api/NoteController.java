package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.logic.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

  private final NoteService service;

  @Autowired
  public NoteController(NoteService service) { this.service = service; }

  @RequestMapping
  Iterable<NoteDto> getNotes() { return service.findAll(); }

  @RequestMapping("/{id}")
  NoteDto getNoteById(@PathVariable int id) { return service.findById(id); }

  @PostMapping
  NoteDto createNote(@RequestBody NoteDto dto) { return service.createNote(dto); }

  @PutMapping("/{id}")
  NoteDto updateNote(@RequestBody NoteDto dto, @PathVariable int id){
    dto.setId(id);
    return service.updateNote(dto);
  }

  @DeleteMapping("/{id}")
  void deleteNote(@PathVariable int id) { service.deleteNote(id); }

}
