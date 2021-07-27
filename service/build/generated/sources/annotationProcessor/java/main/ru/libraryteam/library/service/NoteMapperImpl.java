package ru.libraryteam.library.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.NoteEntity;
import ru.libraryteam.library.service.model.NoteDto;
import ru.libraryteam.library.service.mapper.NoteMapper;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-27T12:43:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class NoteMapperImpl implements NoteMapper {

    @Override
    public NoteDto fromEntity(NoteEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NoteDto noteDto = new NoteDto();

        noteDto.setId( entity.getId() );
        noteDto.setNoteBody( entity.getNoteBody() );
        noteDto.setBookId( entity.getBookId() );

        return noteDto;
    }

    @Override
    public NoteEntity toEntity(NoteDto dto) {
        if ( dto == null ) {
            return null;
        }

        NoteEntity noteEntity = new NoteEntity();

        noteEntity.setId( dto.getId() );
        noteEntity.setNoteBody( dto.getNoteBody() );
        noteEntity.setBookId( dto.getBookId() );

        return noteEntity;
    }

    @Override
    public List<NoteDto> fromEntities(Iterable<NoteEntity> noteEntities) {
        if ( noteEntities == null ) {
            return null;
        }

        List<NoteDto> list = new ArrayList<NoteDto>();
        for ( NoteEntity noteEntity : noteEntities ) {
            list.add( fromEntity( noteEntity ) );
        }

        return list;
    }
}
