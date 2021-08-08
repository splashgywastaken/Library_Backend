package ru.libraryteam.library.db.converter;

import ru.libraryteam.library.db.entity.ReadingState;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ReadingStateConverter implements AttributeConverter<ReadingState, Integer> {

  @Override
  public Integer convertToDatabaseColumn(ReadingState attribute) {
    return attribute == null ? null : attribute.getId();
  }

  @Override
  public ReadingState convertToEntityAttribute(Integer dbData) {
    return ReadingState.fromId(dbData).orElse(null);
  }
}
