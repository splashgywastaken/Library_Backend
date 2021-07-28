package ru.libraryteam.library.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.service.model.BookDto;
import ru.libraryteam.library.service.mapper.BookMapper;
import ru.libraryteam.library.service.model.BookDtoImpl;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-27T22:48:50+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto fromEntity(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        BookDtoImpl bookDto = new BookDtoImpl();

        bookDto.setId( bookEntity.getId() );
        bookDto.setBookName( bookEntity.getBookName() );
        bookDto.setYearOfPublishing( bookEntity.getYearOfPublishing() );
        bookDto.setIsbn( bookEntity.getIsbn() );
        bookDto.setQuantity( bookEntity.getQuantity() );
        bookDto.setAgeRating( bookEntity.getAgeRating() );
        bookDto.setLanguage( bookEntity.getLanguage() );

        return bookDto;
    }

    @Override
    public BookEntity toEntity(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        BookEntity bookEntity = new BookEntity();

        bookEntity.setId( bookDto.getId() );
        bookEntity.setBookName( bookDto.getBookName() );
        bookEntity.setYearOfPublishing( bookDto.getYearOfPublishing() );
        bookEntity.setQuantity( bookDto.getQuantity() );
        bookEntity.setIsbn( bookDto.getIsbn() );
        bookEntity.setAgeRating( bookDto.getAgeRating() );
        bookEntity.setLanguage( bookDto.getLanguage() );

        return bookEntity;
    }

    @Override
    public List<BookDto> fromEntities(Iterable<BookEntity> bookEntities) {
        if ( bookEntities == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>();
        for ( BookEntity bookEntity : bookEntities ) {
            list.add( fromEntity( bookEntity ) );
        }

        return list;
    }
}
