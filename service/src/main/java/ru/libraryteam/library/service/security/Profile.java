package ru.libraryteam.library.service.security;

import org.immutables.value.Value;
import ru.libraryteam.library.commons.Role;

@Value.Immutable
public interface Profile {

  int getId();
  String getFirstName();
  String getLastName();
  String getUsername();
  String getPassword();
  Role getRole();

}
