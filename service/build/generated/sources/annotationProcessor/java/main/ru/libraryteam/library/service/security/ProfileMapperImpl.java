package ru.libraryteam.library.service.security;

import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.UserEntity;
import ru.libraryteam.library.service.security.ImmutableProfile.Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-09T00:10:22+0300",
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
        profile.middleName( userEntity.getMiddleName() );
        profile.sex( userEntity.getSex() );
        profile.email( userEntity.getEmail() );
        profile.username( userEntity.getUsername() );
        if ( userEntity.getBirthday() != null ) {
            profile.birthday( DateTimeFormatter.ISO_LOCAL_DATE.format( userEntity.getBirthday() ) );
        }
        profile.password( userEntity.getPassword() );
        profile.role( userEntity.getRole() );

        return profile.build();
    }
}
