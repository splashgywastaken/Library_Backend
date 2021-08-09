package ru.libraryteam.library.service.logic;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.service.model.TagDto;

import java.util.List;

public interface TagService {
  TagDto createTag(TagDto dto);

  TagDto findTagById(int id);

  List<TagDto> findAllTags();

  TagDto updateTag(TagDto dto);

  void deleteDto(int id);
}
