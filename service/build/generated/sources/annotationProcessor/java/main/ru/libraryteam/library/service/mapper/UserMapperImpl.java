package ru.libraryteam.library.service.mapper;

import java.sql.Date;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.BookEntity;
import ru.libraryteam.library.db.entity.ReadingListEntity;
import ru.libraryteam.library.db.entity.ReviewEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.ImmutableReviewDto;
import ru.libraryteam.library.service.model.ImmutableUserDto;
import ru.libraryteam.library.service.model.ImmutableUserDto.Builder;
import ru.libraryteam.library.service.model.ReviewDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.create.dto.UserCreateDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleBookDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;
import ru.libraryteam.library.service.model.simple.dto.userbooks.SimpleReadingListForUserBooksDto;
import ru.libraryteam.library.service.model.simple.dto.userbooks.SimpleUserForUserBooksDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-09T00:10:22+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto fromEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Builder userDto = ImmutableUserDto.builder();

        userDto.id( entity.getId() );
        userDto.username( entity.getUsername() );
        userDto.firstName( entity.getFirstName() );
        userDto.lastName( entity.getLastName() );
        userDto.middleName( entity.getMiddleName() );
        userDto.birthday( entity.getBirthday() );
        userDto.sex( entity.getSex() );
        userDto.email( entity.getEmail() );
        userDto.role( entity.getRole() );

        return userDto.build();
    }

    @Override
    public List<UserDto> formEntities(Iterable<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>();
        for ( UserEntity userEntity : entities ) {
            list.add( fromEntity( userEntity ) );
        }

        return list;
    }

    @Override
    public void toEntity(UserDto dto, UserEntity original) {
        if ( dto == null ) {
            return;
        }

        original.setFirstName( dto.getFirstName() );
        original.setLastName( dto.getLastName() );
        original.setMiddleName( dto.getMiddleName() );
        original.setEmail( dto.getEmail() );
        original.setBirthday( dto.getBirthday() );
        original.setSex( dto.getSex() );
        original.setUsername( dto.getUsername() );
    }

    @Override
    public UserEntity toEntity(UserCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setFirstName( dto.getFirstName() );
        userEntity.setLastName( dto.getLastName() );
        userEntity.setMiddleName( dto.getMiddleName() );
        userEntity.setEmail( dto.getEmail() );
        userEntity.setBirthday( dto.getBirthday() );
        if ( dto.getSex() != null ) {
            userEntity.setSex( String.valueOf( dto.getSex() ) );
        }
        userEntity.setUsername( dto.getUsername() );
        userEntity.setPassword( dto.getPassword() );
        userEntity.setRole( dto.getRole() );

        return userEntity;
    }

    @Override
    public SimpleUserDto fromSimpleEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SimpleUserDto simpleUserDto = new SimpleUserDto();

        simpleUserDto.setId( entity.getId() );
        simpleUserDto.setFirstName( entity.getFirstName() );
        simpleUserDto.setLastName( entity.getLastName() );
        simpleUserDto.setMiddleName( entity.getMiddleName() );

        return simpleUserDto;
    }

    @Override
    public List<SimpleUserDto> fromSimpleEntities(Iterable<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SimpleUserDto> list = new ArrayList<SimpleUserDto>();
        for ( UserEntity userEntity : entities ) {
            list.add( fromSimpleEntity( userEntity ) );
        }

        return list;
    }

    @Override
    public SimpleUserForUserBooksDto simpleUserForUserBooksDtoFromEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SimpleUserForUserBooksDto simpleUserForUserBooksDto = new SimpleUserForUserBooksDto();

        simpleUserForUserBooksDto.setId( entity.getId() );
        simpleUserForUserBooksDto.setFirstName( entity.getFirstName() );
        simpleUserForUserBooksDto.setLastName( entity.getLastName() );
        simpleUserForUserBooksDto.setMiddleName( entity.getMiddleName() );
        if ( entity.getBirthday() != null ) {
            simpleUserForUserBooksDto.setBirthday( new Date( entity.getBirthday().atStartOfDay( ZoneOffset.UTC ).toInstant().toEpochMilli() ) );
        }
        simpleUserForUserBooksDto.setSex( entity.getSex() );
        simpleUserForUserBooksDto.setLists( readingListEntitySetToSimpleReadingListForUserBooksDtoList( entity.getLists() ) );

        return simpleUserForUserBooksDto;
    }

    @Override
    public List<SimpleUserForUserBooksDto> simpleUserForUserBooksDtoFromEntities(Iterable<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SimpleUserForUserBooksDto> list = new ArrayList<SimpleUserForUserBooksDto>();
        for ( UserEntity userEntity : entities ) {
            list.add( simpleUserForUserBooksDtoFromEntity( userEntity ) );
        }

        return list;
    }

    protected SimpleBookDto bookEntityToSimpleBookDto(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        SimpleBookDto simpleBookDto = new SimpleBookDto();

        simpleBookDto.setId( bookEntity.getId() );
        simpleBookDto.setBookName( bookEntity.getBookName() );

        return simpleBookDto;
    }

    protected ReviewDto reviewEntityToReviewDto(ReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }

        ru.libraryteam.library.service.model.ImmutableReviewDto.Builder reviewDto = ImmutableReviewDto.builder();

        reviewDto.id( reviewEntity.getId() );
        reviewDto.reviewRating( reviewEntity.getReviewRating() );

        return reviewDto.build();
    }

    protected SimpleReadingListForUserBooksDto readingListEntityToSimpleReadingListForUserBooksDto(ReadingListEntity readingListEntity) {
        if ( readingListEntity == null ) {
            return null;
        }

        SimpleReadingListForUserBooksDto simpleReadingListForUserBooksDto = new SimpleReadingListForUserBooksDto();

        simpleReadingListForUserBooksDto.setId( readingListEntity.getId() );
        simpleReadingListForUserBooksDto.setReadingState( readingListEntity.getReadingState() );
        simpleReadingListForUserBooksDto.setDaysLeft( readingListEntity.getDaysLeft() );
        simpleReadingListForUserBooksDto.setBook( bookEntityToSimpleBookDto( readingListEntity.getBook() ) );
        simpleReadingListForUserBooksDto.setReview( reviewEntityToReviewDto( readingListEntity.getReview() ) );

        return simpleReadingListForUserBooksDto;
    }

    protected List<SimpleReadingListForUserBooksDto> readingListEntitySetToSimpleReadingListForUserBooksDtoList(Set<ReadingListEntity> set) {
        if ( set == null ) {
            return null;
        }

        List<SimpleReadingListForUserBooksDto> list = new ArrayList<SimpleReadingListForUserBooksDto>( set.size() );
        for ( ReadingListEntity readingListEntity : set ) {
            list.add( readingListEntityToSimpleReadingListForUserBooksDto( readingListEntity ) );
        }

        return list;
    }
}
