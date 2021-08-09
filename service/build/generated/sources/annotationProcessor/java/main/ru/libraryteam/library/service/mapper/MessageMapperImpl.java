package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.MessageEntity;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.model.MessageDto;
import ru.libraryteam.library.service.model.create.dto.MessageCreateDto;
import ru.libraryteam.library.service.model.simple.dto.SimpleUserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-09T10:45:58+0300",
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
    public void toEntity(MessageDto dto, MessageEntity original) {
        if ( dto == null ) {
            return;
        }

        original.setId( dto.getId() );
        original.setMessageBody( dto.getMessageBody() );
        if ( dto.getUser() != null ) {
            if ( original.getUser() == null ) {
                original.setUser( new UserEntity() );
            }
            simpleUserDtoToUserEntity( dto.getUser(), original.getUser() );
        }
        else {
            original.setUser( null );
        }
        original.setUserId( dto.getUserId() );
        original.setBookId( dto.getBookId() );
    }

    @Override
    public MessageEntity toEntity(MessageCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setId( dto.getId() );
        messageEntity.setMessageBody( dto.getMessageBody() );
        messageEntity.setUser( simpleUserDtoToUserEntity1( dto.getUser() ) );
        messageEntity.setUserId( dto.getUserId() );
        messageEntity.setBookId( dto.getBookId() );

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

    protected void simpleUserDtoToUserEntity(SimpleUserDto simpleUserDto, UserEntity mappingTarget) {
        if ( simpleUserDto == null ) {
            return;
        }

        mappingTarget.setId( simpleUserDto.getId() );
        mappingTarget.setFirstName( simpleUserDto.getFirstName() );
        mappingTarget.setLastName( simpleUserDto.getLastName() );
        mappingTarget.setMiddleName( simpleUserDto.getMiddleName() );
    }

    protected UserEntity simpleUserDtoToUserEntity1(SimpleUserDto simpleUserDto) {
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
