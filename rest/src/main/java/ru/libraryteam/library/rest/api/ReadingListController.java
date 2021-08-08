package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.ReadingListService;
import ru.libraryteam.library.service.model.PageDto;
import ru.libraryteam.library.service.model.ReadingListDto;

@RestController
@RequestMapping("/lists")
public class ReadingListController {

  private final ReadingListService readingListService;

  @Autowired
  public ReadingListController(ReadingListService readingListService) {
    this.readingListService = readingListService;
  }

  @GetMapping(value = "/{id}")
  ReadingListDto findListById(@PathVariable(value = "id") int id) {
    return readingListService.findById(id);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  ReadingListDto createReadingList(@RequestBody ReadingListDto dto) {
    return readingListService.createReadingList(dto);
  }

  @PutMapping(value = "/librarian-accepted/{id}")
  ReadingListDto acceptSubscription(@RequestBody ReadingListDto dto, @PathVariable(value = "id") int id) {
    dto.setId(id);
    return readingListService.acceptSubscription(dto);
  }

  @PutMapping(value = "/user-finished/{id}")
  ReadingListDto userFinishedReading(@RequestBody ReadingListDto dto, @PathVariable(value = "id") int id) {
    dto.setId(id);
    return readingListService.userFinishedReading(dto);
  }

  @GetMapping
  PageDto<ReadingListDto> getReadingLists(
    @RequestParam(name = "page_size", defaultValue = "10") Integer pageSize,
    @RequestParam(name = "page_number", defaultValue = "0") Integer pageNumber
  ) {
    return readingListService.findAll(pageSize, pageNumber);
  }

  @DeleteMapping("/{id}")
  void deleteList(@PathVariable(value = "id") int id) { readingListService.deleteList(id); }
}
