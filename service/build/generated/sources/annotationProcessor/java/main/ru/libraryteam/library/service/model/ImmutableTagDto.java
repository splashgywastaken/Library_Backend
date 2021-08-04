package ru.libraryteam.library.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link TagDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTagDto.builder()}.
 */
@Generated(from = "TagDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableTagDto implements TagDto {
  private final @Nullable Integer id;
  private final String tagName;

  private ImmutableTagDto(@Nullable Integer id, String tagName) {
    this.id = id;
    this.tagName = tagName;
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
   * @return The value of the {@code tagName} attribute
   */
  @JsonProperty("tag_name")
  @Override
  public String getTagName() {
    return tagName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TagDto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTagDto withId(@Nullable Integer value) {
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTagDto(value, this.tagName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TagDto#getTagName() tagName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for tagName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTagDto withTagName(String value) {
    String newValue = Objects.requireNonNull(value, "tagName");
    if (this.tagName.equals(newValue)) return this;
    return new ImmutableTagDto(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTagDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTagDto
        && equalTo((ImmutableTagDto) another);
  }

  private boolean equalTo(ImmutableTagDto another) {
    return Objects.equals(id, another.id)
        && tagName.equals(another.tagName);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code tagName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + tagName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TagDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TagDto{"
        + "id=" + id
        + ", tagName=" + tagName
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link TagDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TagDto instance
   */
  public static ImmutableTagDto copyOf(TagDto instance) {
    if (instance instanceof ImmutableTagDto) {
      return (ImmutableTagDto) instance;
    }
    return ImmutableTagDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTagDto ImmutableTagDto}.
   * <pre>
   * ImmutableTagDto.builder()
   *    .id(Integer | null) // nullable {@link TagDto#getId() id}
   *    .tagName(String) // required {@link TagDto#getTagName() tagName}
   *    .build();
   * </pre>
   * @return A new ImmutableTagDto builder
   */
  public static ImmutableTagDto.Builder builder() {
    return new ImmutableTagDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTagDto ImmutableTagDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TagDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_TAG_NAME = 0x1L;
    private long initBits = 0x1L;

    private Integer id;
    private String tagName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TagDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TagDto instance) {
      Objects.requireNonNull(instance, "instance");
      Integer idValue = instance.getId();
      if (idValue != null) {
        id(idValue);
      }
      tagName(instance.getTagName());
      return this;
    }

    /**
     * Initializes the value for the {@link TagDto#getId() id} attribute.
     * @param id The value for id (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(@Nullable Integer id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the value for the {@link TagDto#getTagName() tagName} attribute.
     * @param tagName The value for tagName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tag_name")
    public final Builder tagName(String tagName) {
      this.tagName = Objects.requireNonNull(tagName, "tagName");
      initBits &= ~INIT_BIT_TAG_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTagDto ImmutableTagDto}.
     * @return An immutable instance of TagDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTagDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTagDto(id, tagName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TAG_NAME) != 0) attributes.add("tagName");
      return "Cannot build TagDto, some of required attributes are not set " + attributes;
    }
  }
}
