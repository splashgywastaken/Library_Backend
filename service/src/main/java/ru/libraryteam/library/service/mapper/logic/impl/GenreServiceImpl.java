package ru.libraryteam.library.service.mapper.logic.impl;

import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.GenreRepository;
import ru.libraryteam.library.service.mapper.GenreMapper;
import ru.libraryteam.library.service.mapper.dto.GenreDto;
import ru.libraryteam.library.service.mapper.logic.GenreService;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

  private final GenreRepository repository;
  private final GenreMapper mapper;

  public GenreServiceImpl(GenreRepository repository, GenreMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public GenreDto createGenre(GenreDto genreDto) {
    return mapper.fromEntity(
      repository.save(
        mapper.toEntity(genreDto)
      )
    );
  }

  @Override
  public GenreDto findById(int id) {
    return mapper.fromEntity(repository.findById(id).orElse(null));
  }

  @Override
  public List<GenreDto> findAll() {
    return mapper.fromEntities(repository.findAll());
  }

  @Override
  public GenreDto updateGenre(GenreDto genreDto) {
    return createGenre(genreDto);
  }

  @Override
  public void deleteGenre(int id) {
    repository.deleteById(id);
  }
}
