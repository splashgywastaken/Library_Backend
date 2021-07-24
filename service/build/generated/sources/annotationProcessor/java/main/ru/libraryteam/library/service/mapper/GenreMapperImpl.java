package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.GenreEntity;
import ru.libraryteam.library.service.mapper.dto.GenreDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-24T12:09:05+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class GenreMapperImpl implements GenreMapper {

    @Override
    public GenreDto fromEntity(GenreEntity genreEntity) {
        if ( genreEntity == null ) {
            return null;
        }

        GenreDto genreDto = new GenreDto();

        genreDto.setId( genreEntity.getId() );
        genreDto.setGenreName( genreEntity.getGenreName() );

        return genreDto;
    }

    @Override
    public GenreEntity toEntity(GenreDto genreDto) {
        if ( genreDto == null ) {
            return null;
        }

        GenreEntity genreEntity = new GenreEntity();

        genreEntity.setId( genreDto.getId() );
        genreEntity.setGenreName( genreDto.getGenreName() );

        return genreEntity;
    }

    @Override
    public List<GenreDto> fromEntities(Iterable<GenreEntity> genreEntities) {
        if ( genreEntities == null ) {
            return null;
        }

        List<GenreDto> list = new ArrayList<GenreDto>();
        for ( GenreEntity genreEntity : genreEntities ) {
            list.add( fromEntity( genreEntity ) );
        }

        return list;
    }
}
