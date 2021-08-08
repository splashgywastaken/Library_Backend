package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T20:38:04+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDto fromEntity(MessageEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MessageDto messageDto = new MessageDto();

        messageDto.setId( entity.getId() );
        messageDto.setMessageBody( entity.getMessageBody() );
        messageDto.setUser( userEntityToSimpleUserDto( entity.getUser() ) );
        messageDto.setUserId( entity.getUserId() );
        messageDto.setBookId( entity.getBookId() );

        return messageDto;
    }

    @Override
    public List<MessageDto> fromEntities(Iterable<MessageEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MessageDto> list = new ArrayList<MessageDto>();
        for ( MessageEntity messageEntity : entities ) {
            list.add( fromEntity( messageEntity ) );
        }

        return list;
    }

    @Override
    public MessageEntity toEntity(MessageDto messageDto) {
        if ( messageDto == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setId( messageDto.getId() );
        messageEntity.setMessageBody( messageDto.getMessageBody() );
        messageEntity.setUser( simpleUserDtoToUserEntity( messageDto.getUser() ) );
        messageEntity.setUserId( messageDto.getUserId() );
        messageEntity.setBookId( messageDto.getBookId() );

        return messageEntity;
    }

    protected SimpleUserDto userEntityToSimpleUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        SimpleUserDto simpleUserDto = new SimpleUserDto();

        simpleUserDto.setId( userEntity.getId() );
        simpleUserDto.setFirstName( userEntity.getFirstName() );
        simpleUserDto.setLastName( userEntity.getLastName() );
        simpleUserDto.setMiddleName( userEntity.getMiddleName() );

        return simpleUserDto;
    }

    protected UserEntity simpleUserDtoToUserEntity(SimpleUserDto simpleUserDto) {
        if ( simpleUserDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( simpleUserDto.getId() );
        userEntity.setFirstName( simpleUserDto.getFirstName() );
        userEntity.setLastName( simpleUserDto.getLastName() );
        userEntity.setMiddleName( simpleUserDto.getMiddleName() );

        return userEntity;
    }
}
