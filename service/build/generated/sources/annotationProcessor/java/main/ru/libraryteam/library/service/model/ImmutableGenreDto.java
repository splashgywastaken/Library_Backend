package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GenreDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGenreDto.builder()}.
 */
@Generated(from = "GenreDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableGenreDto implements GenreDto {
  private final Integer id;
  private final String genreName;

  private ImmutableGenreDto(Integer id, String genreName) {
    this.id = id;
    this.genreName = genreName;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Integer getId() {
    return id;
  }

  /**
   * @return The value of the {@code genreName} attribute
   */
  @JsonProperty("genre_name")
  @Override
  public String getGenreName() {
    return genreName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GenreDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGenreDto withId(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableGenreDto(newValue, this.genreName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GenreDto#getGenreName() genreName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for genreName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGenreDto withGenreName(String value) {
    String newValue = Objects.requireNonNull(value, "genreName");
    if (this.genreName.equals(newValue)) return this;
    return new ImmutableGenreDto(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGenreDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGenreDto
        && equalTo((ImmutableGenreDto) another);
  }

  private boolean equalTo(ImmutableGenreDto another) {
    return id.equals(another.id)
        && genreName.equals(another.genreName);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code genreName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + genreName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GenreDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "GenreDto{"
        + "id=" + id
        + ", genreName=" + genreName
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link GenreDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GenreDto instance
   */
  public static ImmutableGenreDto copyOf(GenreDto instance) {
    if (instance instanceof ImmutableGenreDto) {
      return (ImmutableGenreDto) instance;
    }
    return ImmutableGenreDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGenreDto ImmutableGenreDto}.
   * <pre>
   * ImmutableGenreDto.builder()
   *    .id(Integer) // required {@link GenreDto#getId() id}
   *    .genreName(String) // required {@link GenreDto#getGenreName() genreName}
   *    .build();
   * </pre>
   * @return A new ImmutableGenreDto builder
   */
  public static ImmutableGenreDto.Builder builder() {
    return new ImmutableGenreDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGenreDto ImmutableGenreDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GenreDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_GENRE_NAME = 0x2L;
    private long initBits = 0x3L;

    private Integer id;
    private String genreName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GenreDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(GenreDto instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      genreName(instance.getGenreName());
      return this;
    }

    /**
     * Initializes the value for the {@link GenreDto#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Integer id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link GenreDto#getGenreName() genreName} attribute.
     * @param genreName The value for genreName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genre_name")
    public final Builder genreName(String genreName) {
      this.genreName = Objects.requireNonNull(genreName, "genreName");
      initBits &= ~INIT_BIT_GENRE_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGenreDto ImmutableGenreDto}.
     * @return An immutable instance of GenreDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGenreDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGenreDto(id, genreName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_GENRE_NAME) != 0) attributes.add("genreName");
      return "Cannot build GenreDto, some of required attributes are not set " + attributes;
    }
  }
}
