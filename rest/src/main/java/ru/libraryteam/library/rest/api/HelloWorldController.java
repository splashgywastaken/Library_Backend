package ru.libraryteam.library.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.libraryteam.library.db.HelloWorldProvider;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  private final HelloWorldProvider provider;

  @Autowired
  public HelloWorldController(HelloWorldProvider provider) {
    this.provider = provider;
  }

  @GetMapping("/world")
  public String helloWorld(
    @RequestParam(name = "name", defaultValue = "someone") String name
  ) {
    return provider.sayHello(name);
  }

  @GetMapping("/{name}")
  public String HelloA(
    @PathVariable("name") String name
  ) {
    return provider.sayHello(name);
  }
}
