package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.AchievementEntity;
import ru.libraryteam.library.service.model.AchievementDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T14:52:13+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class AchievementMapperImpl implements AchievementMapper {

    @Override
    public AchievementDto fromEntity(AchievementEntity achievementEntity) {
        if ( achievementEntity == null ) {
            return null;
        }

        AchievementDto achievementDto = new AchievementDto();

        achievementDto.setId( achievementEntity.getId() );
        achievementDto.setName( achievementEntity.getName() );

        return achievementDto;
    }

    @Override
    public AchievementEntity toEntity(AchievementDto achievementDto) {
        if ( achievementDto == null ) {
            return null;
        }

        AchievementEntity achievementEntity = new AchievementEntity();

        achievementEntity.setId( achievementDto.getId() );
        achievementEntity.setName( achievementDto.getName() );

        return achievementEntity;
    }

    @Override
    public List<AchievementDto> fromEntities(Iterable<AchievementEntity> achievementEntities) {
        if ( achievementEntities == null ) {
            return null;
        }

        List<AchievementDto> list = new ArrayList<AchievementDto>();
        for ( AchievementEntity achievementEntity : achievementEntities ) {
            list.add( fromEntity( achievementEntity ) );
        }

        return list;
    }
}
