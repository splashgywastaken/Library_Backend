package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.db.entity.ReadingListEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.ReadingListDto;
import ru.libraryteam.library.service.model.ReadingListWithBookReviewDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T14:13:09+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ReadingListMapperImpl implements ReadingListMapper {

    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public ReadingListWithBookReviewDto fromEntityWithBookReview(ReadingListEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReadingListWithBookReviewDto readingListWithBookReviewDto = new ReadingListWithBookReviewDto();

        readingListWithBookReviewDto.setId( entity.getId() );
        readingListWithBookReviewDto.setReadingState( entity.getReadingState() );
        readingListWithBookReviewDto.setReadingStartedAt( entity.getReadingStartedAt() );
        readingListWithBookReviewDto.setReadingFinishedAt( entity.getReadingFinishedAt() );
        readingListWithBookReviewDto.setUserId( entity.getUserId() );
        readingListWithBookReviewDto.setBookId( entity.getBookId() );
        readingListWithBookReviewDto.setDaysLeft( entity.getDaysLeft() );
        readingListWithBookReviewDto.setReviewId( entity.getReviewId() );
        readingListWithBookReviewDto.setReview( reviewMapper.fromEntity( entity.getReview() ) );
        readingListWithBookReviewDto.setBook( bookEntityToSimpleBookDto( entity.getBook() ) );
        readingListWithBookReviewDto.setUser( userMapper.fromSimpleEntity( entity.getUser() ) );

        return readingListWithBookReviewDto;
    }

    @Override
    public List<ReadingListWithBookReviewDto> fromEntitiesWithBookReview(Iterable<ReadingListEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReadingListWithBookReviewDto> list = new ArrayList<ReadingListWithBookReviewDto>();
        for ( ReadingListEntity readingListEntity : entities ) {
            list.add( fromEntityWithBookReview( readingListEntity ) );
        }

        return list;
    }

    @Override
    public ReadingListDto fromEntity(ReadingListEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReadingListDto readingListDto = new ReadingListDto();

        readingListDto.setId( entity.getId() );
        readingListDto.setReadingState( entity.getReadingState() );
        readingListDto.setReadingStartedAt( entity.getReadingStartedAt() );
        readingListDto.setReadingFinishedAt( entity.getReadingFinishedAt() );
        readingListDto.setUserId( entity.getUserId() );
        readingListDto.setBookId( entity.getBookId() );
        readingListDto.setDaysLeft( entity.getDaysLeft() );
        readingListDto.setReviewId( entity.getReviewId() );

        return readingListDto;
    }

    @Override
    public ReadingListEntity toEntity(ReadingListDto dto) {
        if ( dto == null ) {
            return null;
        }

        ReadingListEntity readingListEntity = new ReadingListEntity();

        readingListEntity.setId( dto.getId() );
        readingListEntity.setReadingStartedAt( dto.getReadingStartedAt() );
        readingListEntity.setReadingFinishedAt( dto.getReadingFinishedAt() );
        readingListEntity.setReadingState( dto.getReadingState() );
        readingListEntity.setUserId( dto.getUserId() );
        readingListEntity.setBookId( dto.getBookId() );
        readingListEntity.setDaysLeft( dto.getDaysLeft() );
        readingListEntity.setReviewId( dto.getReviewId() );

        return readingListEntity;
    }

    @Override
    public List<ReadingListDto> fromEntities(Iterable<ReadingListEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReadingListDto> list = new ArrayList<ReadingListDto>();
        for ( ReadingListEntity readingListEntity : entities ) {
            list.add( fromEntity( readingListEntity ) );
        }

        return list;
    }

    @Override
    public ReadingListEntity toEntityWithBookReview(ReadingListWithBookReviewDto dto) {
        if ( dto == null ) {
            return null;
        }

        ReadingListEntity readingListEntity = new ReadingListEntity();

        readingListEntity.setId( dto.getId() );
        readingListEntity.setReadingStartedAt( dto.getReadingStartedAt() );
        readingListEntity.setReadingFinishedAt( dto.getReadingFinishedAt() );
        readingListEntity.setReadingState( dto.getReadingState() );
        readingListEntity.setReview( reviewMapper.toEntity( dto.getReview() ) );
        readingListEntity.setBook( simpleBookDtoToBookEntity( dto.getBook() ) );
        readingListEntity.setUserId( dto.getUserId() );
        readingListEntity.setBookId( dto.getBookId() );
        readingListEntity.setDaysLeft( dto.getDaysLeft() );
        readingListEntity.setReviewId( dto.getReviewId() );
        readingListEntity.setUser( simpleUserDtoToUserEntity( dto.getUser() ) );

        return readingListEntity;
    }

    protected SimpleBookDto bookEntityToSimpleBookDto(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        SimpleBookDto simpleBookDto = new SimpleBookDto();

        simpleBookDto.setId( bookEntity.getId() );
        simpleBookDto.setBookName( bookEntity.getBookName() );
        simpleBookDto.setYearOfPublishing( bookEntity.getYearOfPublishing() );

        return simpleBookDto;
    }

    protected BookEntity simpleBookDtoToBookEntity(SimpleBookDto simpleBookDto) {
        if ( simpleBookDto == null ) {
            return null;
        }

        BookEntity bookEntity = new BookEntity();

        bookEntity.setId( simpleBookDto.getId() );
        bookEntity.setBookName( simpleBookDto.getBookName() );
        bookEntity.setYearOfPublishing( simpleBookDto.getYearOfPublishing() );

        return bookEntity;
    }

    protected UserEntity simpleUserDtoToUserEntity(SimpleUserDto simpleUserDto) {
        if ( simpleUserDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( simpleUserDto.getId() );
        userEntity.setFirstName( simpleUserDto.getFirstName() );
        userEntity.setLastName( simpleUserDto.getLastName() );
        userEntity.setUsername( simpleUserDto.getUsername() );

        return userEntity;
    }
}
