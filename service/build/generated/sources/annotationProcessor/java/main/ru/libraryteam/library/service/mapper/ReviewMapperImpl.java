package ru.libraryteam.library.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.libraryteam.library.db.entity.ReviewEntity;
import ru.libraryteam.library.service.model.ImmutableReviewDto;
import ru.libraryteam.library.service.model.ImmutableReviewDto.Builder;
import ru.libraryteam.library.service.model.ReviewDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-08T14:03:31+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewEntity toEntity(ReviewDto dto) {
        if ( dto == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setId( dto.getId() );
        reviewEntity.setReviewRating( dto.getReviewRating() );

        return reviewEntity;
    }

    @Override
    public ReviewDto fromEntity(ReviewEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Builder reviewDto = ImmutableReviewDto.builder();

        reviewDto.id( entity.getId() );
        reviewDto.reviewRating( entity.getReviewRating() );

        return reviewDto.build();
    }

    @Override
    public List<ReviewDto> fromEntities(Iterable<ReviewEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReviewDto> list = new ArrayList<ReviewDto>();
        for ( ReviewEntity reviewEntity : entities ) {
            list.add( fromEntity( reviewEntity ) );
        }

        return list;
    }
}
