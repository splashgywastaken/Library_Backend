package ru.libraryteam.library.service.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.libraryteam.library.db.repository.GenreRepository;
import ru.libraryteam.library.service.logic.GenreService;
import ru.libraryteam.library.service.mapper.GenreMapper;
import ru.libraryteam.library.service.model.GenreDto;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

  private final GenreRepository genreRepository;
  private final GenreMapper genreMapper;

  @Autowired
  public GenreServiceImpl(GenreRepository genreRepository, GenreMapper genreMapper) {
    this.genreRepository = genreRepository;
    this.genreMapper = genreMapper;
  }

  @Override
  public GenreDto createGenre(GenreDto genreDto) {
    return genreMapper.fromEntity(
      genreRepository.save(
        genreMapper.toEntity(genreDto)
      )
    );
  }

  @Override
  public GenreDto findById(int id) {
    return genreMapper.fromEntity(genreRepository.findById(id).orElse(null));
  }

  @Override
  public List<GenreDto> findAll() {
    return genreMapper.fromEntities(genreRepository.findAll());
  }

  @Override
  public GenreDto updateGenre(GenreDto genreDto) {
    return createGenre(genreDto);
  }

  @Override
  public void deleteGenre(int id) {
    genreRepository.deleteById(id);
  }
}
