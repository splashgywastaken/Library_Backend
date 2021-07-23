package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.mapper.dto.AuthorDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-23T23:20:42+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDto fromEntity(AuthorEntity authorEntity) {
        if ( authorEntity == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( authorEntity.getId() );
        authorDto.setFirstName( authorEntity.getFirstName() );
        authorDto.setLastName( authorEntity.getLastName() );
        authorDto.setMiddleName( authorEntity.getMiddleName() );
        authorDto.setPseudonym( authorEntity.getPseudonym() );

        return authorDto;
    }

    @Override
    public AuthorEntity toEntity(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        AuthorEntity authorEntity = new AuthorEntity();

        authorEntity.setId( authorDto.getId() );
        authorEntity.setFirstName( authorDto.getFirstName() );
        authorEntity.setLastName( authorDto.getLastName() );
        authorEntity.setMiddleName( authorDto.getMiddleName() );
        authorEntity.setPseudonym( authorDto.getPseudonym() );

        return authorEntity;
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
