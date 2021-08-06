package ru.libraryteam.library.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import ru.libraryteam.library.db.repository.UserRepository;
import ru.libraryteam.library.service.security.ProfileMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LibrarySuccessHandler implements AuthenticationSuccessHandler {

  private final UserRepository userRepository;
  private final ProfileMapper profileMapper;

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  @Autowired
  public LibrarySuccessHandler(UserRepository userRepository, ProfileMapper profileMapper) {
    this.userRepository = userRepository;
    this.profileMapper = profileMapper;
  }

  @Override
  public void onAuthenticationSuccess(
    HttpServletRequest request,
    HttpServletResponse response,
    Authentication authentication
  ) throws IOException {
    var profile = profileMapper.toProfile(
      userRepository.getByUsername(authentication.getName()));

    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
    response.setStatus(200);
    OBJECT_MAPPER.writeValue(response.getWriter(), profile);
  }
}
