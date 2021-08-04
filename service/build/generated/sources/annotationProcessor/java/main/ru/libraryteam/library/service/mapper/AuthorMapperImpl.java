package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.ImmutableAuthorDto;
import ru.libraryteam.library.service.model.ImmutableAuthorDto.Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T14:52:14+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorEntity toEntity(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        AuthorEntity authorEntity = new AuthorEntity();

        authorEntity.setId( authorDto.getId() );
        authorEntity.setFirstName( authorDto.getFirstName() );
        authorEntity.setLastName( authorDto.getLastName() );

        return authorEntity;
    }

    @Override
    public AuthorDto fromEntity(AuthorEntity authorEntity) {
        if ( authorEntity == null ) {
            return null;
        }

        Builder authorDto = ImmutableAuthorDto.builder();

        authorDto.id( authorEntity.getId() );
        authorDto.firstName( authorEntity.getFirstName() );
        authorDto.lastName( authorEntity.getLastName() );

        return authorDto.build();
    }

    @Override
    public List<AuthorDto> fromEntities(Iterable<AuthorEntity> authorEntities) {
        if ( authorEntities == null ) {
            return null;
        }

        List<AuthorDto> list = new ArrayList<AuthorDto>();
        for ( AuthorEntity authorEntity : authorEntities ) {
            list.add( fromEntity( authorEntity ) );
        }

        return list;
    }
}
