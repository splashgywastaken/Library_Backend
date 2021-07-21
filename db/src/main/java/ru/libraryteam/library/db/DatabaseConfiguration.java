package ru.libraryteam.library.db;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {
  "ru.libraryteam.library.db.entity"
})
@EnableJpaRepositories(basePackages = "ru.libraryteam.library.db.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
}
