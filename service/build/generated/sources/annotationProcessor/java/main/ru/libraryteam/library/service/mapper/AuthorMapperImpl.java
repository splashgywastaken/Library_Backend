package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.AuthorEntity;
import ru.libraryteam.library.service.model.AuthorDto;
import ru.libraryteam.library.service.model.AuthorWithBooksDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-03T02:02:33+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Autowired
    private BookMapper bookMapper;

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
    public AuthorWithBooksDto fromEntityWithBooks(AuthorEntity author) {
        if ( author == null ) {
            return null;
        }

        AuthorWithBooksDto authorWithBooksDto = new AuthorWithBooksDto();

        authorWithBooksDto.setId( author.getId() );
        authorWithBooksDto.setFirstName( author.getFirstName() );
        authorWithBooksDto.setLastName( author.getLastName() );
        authorWithBooksDto.setMiddleName( author.getMiddleName() );
        authorWithBooksDto.setPseudonym( author.getPseudonym() );
        authorWithBooksDto.setBooks( bookMapper.fromEntities( author.getBooks() ) );

        return authorWithBooksDto;
    }

    @Override
    public List<AuthorWithBooksDto> fromEntitiesWithBooks(Iterable<AuthorEntity> authors) {
        if ( authors == null ) {
            return null;
        }

        List<AuthorWithBooksDto> list = new ArrayList<AuthorWithBooksDto>();
        for ( AuthorEntity authorEntity : authors ) {
            list.add( fromEntityWithBooks( authorEntity ) );
        }

        return list;
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
