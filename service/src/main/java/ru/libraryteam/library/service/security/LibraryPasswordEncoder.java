package ru.libraryteam.library.service.security;

public interface LibraryPasswordEncoder {

  String encode(CharSequence charSequence);

}
