package ru.libraryteam.library.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.service.security.LibraryPasswordEncoder;

@Component
public class LibraryPasswordEncoderImpl implements LibraryPasswordEncoder {
  private final PasswordEncoder passwordEncoder;

  @Autowired
  public LibraryPasswordEncoderImpl(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public String encode(CharSequence rawPassword) {
    return passwordEncoder.encode(rawPassword);
  }

}
