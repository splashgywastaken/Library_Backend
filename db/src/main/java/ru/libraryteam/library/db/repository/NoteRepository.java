package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.NoteEntity;
import ru.libraryteam.library.db.entity.UserEntity;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<NoteEntity, Integer> {

  Page<NoteEntity> findAll(Pageable pageable);

  List<NoteEntity> findNoteEntitiesByUserId(int id);

  NoteEntity findNoteEntityByUserIdAndBookId(int user_id, int book_id);

  void deleteNoteEntityByUserIdAndBookId(int user_id, int book_id);

}
