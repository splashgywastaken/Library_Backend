package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.complex.dto.BookWithAuthorsGenresDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-03T15:10:22+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private GenreMapper genreMapper;

    @Override
    public BookWithAuthorsGenresDto fromEntityWithAuthorsGenres(BookEntity book) {
        if ( book == null ) {
            return null;
        }

        BookWithAuthorsGenresDto bookWithAuthorsGenresDto = new BookWithAuthorsGenresDto();

        bookWithAuthorsGenresDto.setId( book.getId() );
        bookWithAuthorsGenresDto.setBookName( book.getBookName() );
        bookWithAuthorsGenresDto.setYearOfPublishing( book.getYearOfPublishing() );
        bookWithAuthorsGenresDto.setIsbn( book.getIsbn() );
        bookWithAuthorsGenresDto.setAgeRating( book.getAgeRating() );
        bookWithAuthorsGenresDto.setLanguage( book.getLanguage() );
        bookWithAuthorsGenresDto.setQuantity( book.getQuantity() );
        bookWithAuthorsGenresDto.setAuthors( authorMapper.fromEntities( book.getAuthors() ) );
        bookWithAuthorsGenresDto.setGenres( genreMapper.fromEntities( book.getGenres() ) );

        return bookWithAuthorsGenresDto;
    }

    @Override
    public List<BookWithAuthorsGenresDto> fromEntitiesWithAuthorsGenres(Iterable<BookEntity> books) {
        if ( books == null ) {
            return null;
        }

        List<BookWithAuthorsGenresDto> list = new ArrayList<BookWithAuthorsGenresDto>();
        for ( BookEntity bookEntity : books ) {
            list.add( fromEntityWithAuthorsGenres( bookEntity ) );
        }

        return list;
    }

    @Override
    public BookDto fromEntity(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( bookEntity.getId() );
        bookDto.setBookName( bookEntity.getBookName() );
        bookDto.setYearOfPublishing( bookEntity.getYearOfPublishing() );
        bookDto.setIsbn( bookEntity.getIsbn() );
        bookDto.setAgeRating( bookEntity.getAgeRating() );
        bookDto.setLanguage( bookEntity.getLanguage() );
        bookDto.setQuantity( bookEntity.getQuantity() );

        return bookDto;
    }

    @Override
    public BookEntity toEntity(BookDto dto) {
        if ( dto == null ) {
            return null;
        }

        BookEntity bookEntity = new BookEntity();

        bookEntity.setId( dto.getId() );
        bookEntity.setBookName( dto.getBookName() );
        bookEntity.setYearOfPublishing( dto.getYearOfPublishing() );
        bookEntity.setQuantity( dto.getQuantity() );
        bookEntity.setIsbn( dto.getIsbn() );
        bookEntity.setAgeRating( dto.getAgeRating() );
        bookEntity.setLanguage( dto.getLanguage() );

        return bookEntity;
    }
}
