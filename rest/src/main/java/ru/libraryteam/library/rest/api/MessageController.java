package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.MessageService;
import ru.libraryteam.library.service.model.MessageDto;

@RestController
@RequestMapping("/books/messages")
public class MessageController {

  private final MessageService messageService;

  @Autowired
  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping(value = "/{id}")
  MessageDto findMessageById(@PathVariable(value = "id") int messageId) {
    return messageService.findById(messageId);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  MessageDto createMessage(@RequestBody MessageDto dto) {
    return messageService.createMessage(dto);
  }

  @PutMapping("/{id}")
  MessageDto updateMessage(@RequestBody MessageDto dto, @PathVariable(value = "id") int messageId) {
    dto.setId(messageId);
    return messageService.updateMessage(dto);
  }

  @DeleteMapping("/{id}")
  void deleteMessage(@PathVariable(value = "id") int messageId) { messageService.deleteMessage(messageId); }


}
