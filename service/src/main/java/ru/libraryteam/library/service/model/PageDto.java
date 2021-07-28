package ru.libraryteam.library.service.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface PageDto<T> {

  List<T> getItems();

  int getPageNumber();

  int getTotalPages();
}
