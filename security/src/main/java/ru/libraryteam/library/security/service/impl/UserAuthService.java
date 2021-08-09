package ru.libraryteam.library.security.service.impl;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.libraryteam.library.commons.Role;
import ru.libraryteam.library.service.security.Profile;

@Service
public class UserAuthService {

  private final ObjectProvider<Profile> profileProvider;

  @Autowired
  public UserAuthService(ObjectProvider<Profile> profileProvider) {
    this.profileProvider = profileProvider;
  }

  public boolean canUpdateUser(int id) {
    final var profile = profileProvider.getIfAvailable();

    if (profile == null) {
      return false;
    }

    if (profile.getRole() == Role.ADMIN) {
      return true;
    }

    return profile.getId() == id;

  }

  public boolean canDeleteUser(int id) {
    final var profile = profileProvider.getIfAvailable();

    if (profile == null) {
      return false;
    }

    if (profile.getRole() == Role.ADMIN || profile.getRole() == Role.USER) {
      return true;
    }

    return profile.getId() == id;

  }
}
