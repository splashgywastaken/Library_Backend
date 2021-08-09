package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.libraryteam.library.db.repository.TagRepository;
import ru.libraryteam.library.service.logic.TagService;
import ru.libraryteam.library.service.mapper.TagMapper;
import ru.libraryteam.library.service.model.TagDto;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

  private final TagRepository tagRepository;
  private final TagMapper tagMapper;

  @Autowired
  public TagServiceImpl(TagRepository tagRepository, TagMapper tagMapper) {
    this.tagRepository = tagRepository;
    this.tagMapper = tagMapper;
  }

  @Override
  public TagDto createTag(TagDto dto) {
    return tagMapper.fromEntity(
      tagRepository.save(
        tagMapper.toEntity(dto)
      )
    );
  }

  @Override
  public TagDto findTagById(int id) {
    return tagMapper.fromEntity(
      tagRepository.findById(id)
      .orElse(null)
    );
  }

  @Override
  public List<TagDto> findAllTags() {
    return tagMapper.fromEntities(tagRepository.findAll());
  }

  @Override
  public TagDto updateTag(TagDto dto) {
    return createTag(dto);
  }

  @Override
  public void deleteDto(int id) {
    tagRepository.deleteById(id);
  }
}
