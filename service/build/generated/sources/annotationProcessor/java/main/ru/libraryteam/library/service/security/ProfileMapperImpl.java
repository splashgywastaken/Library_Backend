package ru.libraryteam.library.service.security;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.security.ImmutableProfile.Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-07T01:37:48+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ProfileMapperImpl implements ProfileMapper {

    @Override
    public Profile toProfile(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        Builder profile = ImmutableProfile.builder();

        if ( userEntity.getId() != null ) {
            profile.id( userEntity.getId() );
        }
        profile.firstName( userEntity.getFirstName() );
        profile.lastName( userEntity.getLastName() );
        profile.username( userEntity.getUsername() );
        profile.password( userEntity.getPassword() );
        profile.role( userEntity.getRole() );

        return profile.build();
    }
}
