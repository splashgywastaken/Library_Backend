package ru.libraryteam.library.db.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
  @Query(
    ""
      + "FROM users u "
      + "WHERE LOWER(?1) = LOWER(u.email) "

  )
  UserEntity getByEmail(String email);

  @Query(
    ""
      + "FROM users u "
      + "WHERE LOWER(?1) = LOWER(u.username) "

  )
  UserEntity getByUsername(String username);

  Page<UserEntity> findAll(Pageable pageable);

  UserEntity findByUsernameEqualsIgnoreCase(String name);

  boolean existsByUsernameIgnoreCase(String value);

  boolean existsByIdIsNotAndUsernameIgnoreCase(int id, String username);

  boolean existsByEmailIgnoreCase(String email);

  boolean existsByIdIsNotAndEmailIgnoreCase(int id, String email);
}
