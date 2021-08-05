package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserMessageDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-05T17:38:13+0300",
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

        messageDto.setMessageBody( entity.getMessageBody() );
        messageDto.setUser( userEntityToSimpleUserMessageDto( entity.getUser() ) );
        messageDto.setId( entity.getId() );

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
        messageEntity.setUser( simpleUserMessageDtoToUserEntity( messageDto.getUser() ) );

        return messageEntity;
    }

    protected SimpleUserMessageDto userEntityToSimpleUserMessageDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        SimpleUserMessageDto simpleUserMessageDto = new SimpleUserMessageDto();

        simpleUserMessageDto.setId( userEntity.getId() );
        simpleUserMessageDto.setFirstName( userEntity.getFirstName() );
        simpleUserMessageDto.setLastName( userEntity.getLastName() );

        return simpleUserMessageDto;
    }

    protected UserEntity simpleUserMessageDtoToUserEntity(SimpleUserMessageDto simpleUserMessageDto) {
        if ( simpleUserMessageDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( simpleUserMessageDto.getId() );
        userEntity.setFirstName( simpleUserMessageDto.getFirstName() );
        userEntity.setLastName( simpleUserMessageDto.getLastName() );

        return userEntity;
    }
}
