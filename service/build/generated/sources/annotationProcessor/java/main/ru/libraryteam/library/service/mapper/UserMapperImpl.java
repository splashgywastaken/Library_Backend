package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.ImmutableUserDto;
import ru.libraryteam.library.service.model.ImmutableUserDto.Builder;
import ru.libraryteam.library.service.model.UserCreateDto;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T14:03:31+0300",
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
        userDto.sex( entity.getSex() );
        userDto.email( entity.getEmail() );

        return userDto.build();
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
        if ( dto.getSex() != null ) {
            userEntity.setSex( String.valueOf( dto.getSex() ) );
        }
        userEntity.setUsername( dto.getUsername() );
        userEntity.setPassword( dto.getPassword() );
        userEntity.setRole( dto.getRole() );

        return userEntity;
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
    public SimpleUserDto fromSimpleEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SimpleUserDto simpleUserDto = new SimpleUserDto();

        simpleUserDto.setId( entity.getId() );
        simpleUserDto.setFirstName( entity.getFirstName() );
        simpleUserDto.setLastName( entity.getLastName() );
        simpleUserDto.setUsername( entity.getUsername() );

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
}
