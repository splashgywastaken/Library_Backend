package ru.libraryteam.library.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.db.repository.UserRepository;

import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  @Autowired
  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserEntity x = userRepository.getByUsername(username);

    return
      new User(x.getUsername(), x.getPassword(), List.of( new SimpleGrantedAuthority("ROLE_" + x.getRole().name())));
  }
}
