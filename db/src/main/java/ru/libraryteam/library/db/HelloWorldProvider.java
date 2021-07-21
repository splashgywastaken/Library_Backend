package ru.libraryteam.library.db;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldProvider {
  public String sayHello(String name) {
    if (name == null || name.isBlank()) {
      return "Hello, anonymous";
    }
    return "Hello, " + name;
  }
}
