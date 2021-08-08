package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link ReviewDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReviewDto.builder()}.
 */
@Generated(from = "ReviewDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableReviewDto implements ReviewDto {
  private final @Nullable Integer id;
  private final int reviewRating;

  private ImmutableReviewDto(@Nullable Integer id, int reviewRating) {
    this.id = id;
    this.reviewRating = reviewRating;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public @Nullable Integer getId() {
    return id;
  }

  /**
   * @return The value of the {@code reviewRating} attribute
   */
  @JsonProperty("user_mark")
  @Override
  public int getReviewRating() {
    return reviewRating;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReviewDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReviewDto withId(@Nullable Integer value) {
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableReviewDto(value, this.reviewRating);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReviewDto#getReviewRating() reviewRating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reviewRating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReviewDto withReviewRating(int value) {
    if (this.reviewRating == value) return this;
    return new ImmutableReviewDto(this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReviewDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReviewDto
        && equalTo((ImmutableReviewDto) another);
  }

  private boolean equalTo(ImmutableReviewDto another) {
    return Objects.equals(id, another.id)
        && reviewRating == another.reviewRating;
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code reviewRating}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + reviewRating;
    return h;
  }

  /**
   * Prints the immutable value {@code ReviewDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ReviewDto{"
        + "id=" + id
        + ", reviewRating=" + reviewRating
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ReviewDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ReviewDto instance
   */
  public static ImmutableReviewDto copyOf(ReviewDto instance) {
    if (instance instanceof ImmutableReviewDto) {
      return (ImmutableReviewDto) instance;
    }
    return ImmutableReviewDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReviewDto ImmutableReviewDto}.
   * <pre>
   * ImmutableReviewDto.builder()
   *    .id(Integer | null) // nullable {@link ReviewDto#getId() id}
   *    .reviewRating(int) // required {@link ReviewDto#getReviewRating() reviewRating}
   *    .build();
   * </pre>
   * @return A new ImmutableReviewDto builder
   */
  public static ImmutableReviewDto.Builder builder() {
    return new ImmutableReviewDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReviewDto ImmutableReviewDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ReviewDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_REVIEW_RATING = 0x1L;
    private long initBits = 0x1L;

    private Integer id;
    private int reviewRating;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ReviewDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ReviewDto instance) {
      Objects.requireNonNull(instance, "instance");
      Integer idValue = instance.getId();
      if (idValue != null) {
        id(idValue);
      }
      reviewRating(instance.getReviewRating());
      return this;
    }

    /**
     * Initializes the value for the {@link ReviewDto#getId() id} attribute.
     * @param id The value for id (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(@Nullable Integer id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the value for the {@link ReviewDto#getReviewRating() reviewRating} attribute.
     * @param reviewRating The value for reviewRating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("user_mark")
    public final Builder reviewRating(int reviewRating) {
      this.reviewRating = reviewRating;
      initBits &= ~INIT_BIT_REVIEW_RATING;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReviewDto ImmutableReviewDto}.
     * @return An immutable instance of ReviewDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReviewDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReviewDto(id, reviewRating);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_REVIEW_RATING) != 0) attributes.add("reviewRating");
      return "Cannot build ReviewDto, some of required attributes are not set " + attributes;
    }
  }
}
