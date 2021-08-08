package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.model.BookWithAuthorsGenresTagsDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookWithAuthorsGenresDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T09:50:50+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private TagMapper tagMapper;
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public BookWithAuthorsGenresTagsDto fromEntityWithAuthorsGenresTags(BookEntity book) {
        if ( book == null ) {
            return null;
        }

        BookWithAuthorsGenresTagsDto bookWithAuthorsGenresTagsDto = new BookWithAuthorsGenresTagsDto();

        bookWithAuthorsGenresTagsDto.setId( book.getId() );
        bookWithAuthorsGenresTagsDto.setBookName( book.getBookName() );
        bookWithAuthorsGenresTagsDto.setYearOfPublishing( book.getYearOfPublishing() );
        bookWithAuthorsGenresTagsDto.setIsbn( book.getIsbn() );
        bookWithAuthorsGenresTagsDto.setAgeRating( book.getAgeRating() );
        bookWithAuthorsGenresTagsDto.setLanguage( book.getLanguage() );
        bookWithAuthorsGenresTagsDto.setQuantity( book.getQuantity() );
        bookWithAuthorsGenresTagsDto.setAuthors( authorMapper.fromEntities( book.getAuthors() ) );
        bookWithAuthorsGenresTagsDto.setGenres( genreMapper.fromEntities( book.getGenres() ) );
        bookWithAuthorsGenresTagsDto.setTags( tagMapper.fromEntities( book.getTags() ) );
        bookWithAuthorsGenresTagsDto.setMessages( messageMapper.fromEntities( book.getMessages() ) );

        return bookWithAuthorsGenresTagsDto;
    }

    @Override
    public List<BookWithAuthorsGenresTagsDto> fromEntitiesWithAuthorsGenresTags(Iterable<BookEntity> books) {
        if ( books == null ) {
            return null;
        }

        List<BookWithAuthorsGenresTagsDto> list = new ArrayList<BookWithAuthorsGenresTagsDto>();
        for ( BookEntity bookEntity : books ) {
            list.add( fromEntityWithAuthorsGenresTags( bookEntity ) );
        }

        return list;
    }

    @Override
    public SimpleBookWithAuthorsGenresDto fromEntityWithAuthorsGenres(BookEntity book) {
        if ( book == null ) {
            return null;
        }

        SimpleBookWithAuthorsGenresDto simpleBookWithAuthorsGenresDto = new SimpleBookWithAuthorsGenresDto();

        simpleBookWithAuthorsGenresDto.setId( book.getId() );
        simpleBookWithAuthorsGenresDto.setBookName( book.getBookName() );
        simpleBookWithAuthorsGenresDto.setYearOfPublishing( book.getYearOfPublishing() );
        simpleBookWithAuthorsGenresDto.setAuthors( authorMapper.fromEntities( book.getAuthors() ) );
        simpleBookWithAuthorsGenresDto.setGenres( genreMapper.fromEntities( book.getGenres() ) );

        return simpleBookWithAuthorsGenresDto;
    }

    @Override
    public List<SimpleBookWithAuthorsGenresDto> fromEntitiesWithAuthorsGenres(Iterable<BookEntity> books) {
        if ( books == null ) {
            return null;
        }

        List<SimpleBookWithAuthorsGenresDto> list = new ArrayList<SimpleBookWithAuthorsGenresDto>();
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
