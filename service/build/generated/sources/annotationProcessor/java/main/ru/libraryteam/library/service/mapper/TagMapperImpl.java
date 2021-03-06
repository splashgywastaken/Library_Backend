package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.TagEntity;
import ru.libraryteam.library.service.model.ImmutableTagDto;
import ru.libraryteam.library.service.model.ImmutableTagDto.Builder;
import ru.libraryteam.library.service.model.TagDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-09T10:45:59+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto fromEntity(TagEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Builder tagDto = ImmutableTagDto.builder();

        tagDto.id( entity.getId() );
        tagDto.tagName( entity.getTagName() );

        return tagDto.build();
    }

    @Override
    public TagEntity toEntity(TagDto dto) {
        if ( dto == null ) {
            return null;
        }

        TagEntity tagEntity = new TagEntity();

        tagEntity.setId( dto.getId() );
        tagEntity.setTagName( dto.getTagName() );

        return tagEntity;
    }

    @Override
    public List<TagDto> fromEntities(Iterable<TagEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TagDto> list = new ArrayList<TagDto>();
        for ( TagEntity tagEntity : entities ) {
            list.add( fromEntity( tagEntity ) );
        }

        return list;
    }
}
