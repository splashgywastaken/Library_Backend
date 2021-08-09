package ru.libraryteam.library.security.handler;

import org.springframework.security.access.AccessDeniedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LibraryAccessDeniedHandler
  implements org.springframework.security.web.access.AccessDeniedHandler {
  @Override
  public void handle(
    HttpServletRequest request,
    HttpServletResponse response,
    AccessDeniedException accessDeniedException
  ) throws IOException, ServletException {
    response.setStatus(403);
  }
}
