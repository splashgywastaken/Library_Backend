package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.service.logic.TagService;
import ru.libraryteam.library.service.model.TagDto;

@RestController
@RequestMapping(value = "/tags")
public class TagController {

  private final TagService tagService;

  @Autowired
  public TagController(TagService tagService) {
    this.tagService = tagService;
  }

  @PostMapping
  TagDto createTag(@RequestBody TagDto tag) {
    return tagService.createTag(tag);
  }

  @GetMapping(value = "/{id}")
  TagDto findTagById(@PathVariable(value = "id") int tagId) {
    return tagService.findTagById(tagId);
  }

  @GetMapping
  Iterable<TagDto> findAllTags() {
    return tagService.findAllTags();
  }

  @PutMapping(value = "/{id}")
  TagDto updateTag(@RequestBody TagDto tag, @PathVariable(value = "id") int tagId) {
    tag.setId(tagId);
    return tagService.updateTag(tag);
  }

  @DeleteMapping(value = "/{id}")
  void deleteTag(@PathVariable(value = "id") int tagId) {
    tagService.deleteDto(tagId);
  }
}
