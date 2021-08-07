package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.UserDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-07T01:37:47+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto fromEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( entity.getId() );
        userDto.setFirstName( entity.getFirstName() );
        userDto.setLastName( entity.getLastName() );
        userDto.setMiddleName( entity.getMiddleName() );
        userDto.setBirthday( entity.getBirthday() );
        userDto.setSex( entity.getSex() );
        userDto.setEmail( entity.getEmail() );
        userDto.setUsername( entity.getUsername() );

        return userDto;
    }

    @Override
    public UserEntity toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( dto.getId() );
        userEntity.setFirstName( dto.getFirstName() );
        userEntity.setLastName( dto.getLastName() );
        userEntity.setMiddleName( dto.getMiddleName() );
        userEntity.setEmail( dto.getEmail() );
        userEntity.setBirthday( dto.getBirthday() );
        userEntity.setSex( dto.getSex() );
        userEntity.setUsername( dto.getUsername() );

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
    public SimpleUserMessageDto fromSimpleEntity(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SimpleUserMessageDto simpleUserMessageDto = new SimpleUserMessageDto();

        simpleUserMessageDto.setId( entity.getId() );
        simpleUserMessageDto.setFirstName( entity.getFirstName() );
        simpleUserMessageDto.setLastName( entity.getLastName() );
        simpleUserMessageDto.setUsername( entity.getUsername() );

        return simpleUserMessageDto;
    }

    @Override
    public List<SimpleUserMessageDto> fromSimpleEntities(Iterable<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SimpleUserMessageDto> list = new ArrayList<SimpleUserMessageDto>();
        for ( UserEntity userEntity : entities ) {
            list.add( fromSimpleEntity( userEntity ) );
        }

        return list;
    }
}
