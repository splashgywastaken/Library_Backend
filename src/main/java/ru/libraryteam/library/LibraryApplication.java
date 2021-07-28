package ru.libraryteam.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration(proxyBeanMethods = false)
public class LibraryApplication {

  public static void main(String[] args) {
    SpringApplication.run(LibraryApplication.class, args);
  }


}
